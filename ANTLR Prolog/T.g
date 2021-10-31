grammar T;

options { 	language = Java;}
		//backtrack = true;}

@members{ 	Symantics P = new Symantics();}

prog:           (stat)+  
		;

stat:           fact | query;

fact:           f = exp '(' e1 = exp                            {P.factMaker($f.text, $e1.val);}
                (',' e2 = exp                                   {P.factMaker($f.text, $e2.val);}
                )* 
                ')' '.'                                         {P.Done($f.text); /*P.printHM();*/}
                ;

factQ returns [String s, ArrayList<String> l]:
                f = exp '(' e1 = exp                            {P.factSet($f.text); P.queryMaker($e1.val);}
                (',' e2 = exp                                   {P.queryMaker($e2.val);}
                )*
                ')' '.'                                         {$l = P.getQ(); $s = $f.text; /*P.answer($e1.text, $f.text) */}
                ;

query:          '?-' factQ                                      {P.factChecker($factQ.s, $factQ.l); P.queryDestroyer();}
                ;

exp returns
[String val]:   ID                                              {$val = $ID.text;}
                | VAR                                           {$val = $VAR.text;}
                ;


VAR:	('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    	;

ID:	('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    	;

WS 	:   (' '|'\t'|'\n'|'\r')+ {skip();}
        ;

COMMENTS: ('#') (~('\n' | '\r'))* {skip();}
        ;