// $ANTLR 3.5.2 T.g 2021-05-07 18:52:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENTS", "ID", "VAR", "WS", 
		"'('", "')'", "','", "'.'", "'?-'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int COMMENTS=4;
	public static final int ID=5;
	public static final int VAR=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return TParser.tokenNames; }
	@Override public String getGrammarFileName() { return "T.g"; }

	 	Symantics P = new Symantics();


	// $ANTLR start "prog"
	// T.g:8:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try {
			// T.g:8:5: ( ( stat )+ )
			// T.g:8:17: ( stat )+
			{
			// T.g:8:17: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= VAR)||LA1_0==12) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// T.g:8:18: stat
					{
					pushFollow(FOLLOW_stat_in_prog40);
					stat();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// T.g:11:1: stat : ( fact | query );
	public final void stat() throws RecognitionException {
		try {
			// T.g:11:5: ( fact | query )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= ID && LA2_0 <= VAR)) ) {
				alt2=1;
			}
			else if ( (LA2_0==12) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// T.g:11:17: fact
					{
					pushFollow(FOLLOW_fact_in_stat64);
					fact();
					state._fsp--;

					}
					break;
				case 2 :
					// T.g:11:24: query
					{
					pushFollow(FOLLOW_query_in_stat68);
					query();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stat"



	// $ANTLR start "fact"
	// T.g:13:1: fact : f= exp '(' e1= exp ( ',' e2= exp )* ')' '.' ;
	public final void fact() throws RecognitionException {
		ParserRuleReturnScope f =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		try {
			// T.g:13:5: (f= exp '(' e1= exp ( ',' e2= exp )* ')' '.' )
			// T.g:13:17: f= exp '(' e1= exp ( ',' e2= exp )* ')' '.'
			{
			pushFollow(FOLLOW_exp_in_fact89);
			f=exp();
			state._fsp--;

			match(input,8,FOLLOW_8_in_fact91); 
			pushFollow(FOLLOW_exp_in_fact97);
			e1=exp();
			state._fsp--;

			P.factMaker((f!=null?input.toString(f.start,f.stop):null), (e1!=null?((TParser.exp_return)e1).val:null));
			// T.g:14:17: ( ',' e2= exp )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==10) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// T.g:14:18: ',' e2= exp
					{
					match(input,10,FOLLOW_10_in_fact145); 
					pushFollow(FOLLOW_exp_in_fact151);
					e2=exp();
					state._fsp--;

					P.factMaker((f!=null?input.toString(f.start,f.stop):null), (e2!=null?((TParser.exp_return)e2).val:null));
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,9,FOLLOW_9_in_fact225); 
			match(input,11,FOLLOW_11_in_fact227); 
			P.Done((f!=null?input.toString(f.start,f.stop):null)); /*P.printHM();*/
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fact"


	public static class factQ_return extends ParserRuleReturnScope {
		public String s;
		public ArrayList<String> l;
	};


	// $ANTLR start "factQ"
	// T.g:19:1: factQ returns [String s, ArrayList<String> l] : f= exp '(' e1= exp ( ',' e2= exp )* ')' '.' ;
	public final TParser.factQ_return factQ() throws RecognitionException {
		TParser.factQ_return retval = new TParser.factQ_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope f =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		try {
			// T.g:19:46: (f= exp '(' e1= exp ( ',' e2= exp )* ')' '.' )
			// T.g:20:17: f= exp '(' e1= exp ( ',' e2= exp )* ')' '.'
			{
			pushFollow(FOLLOW_exp_in_factQ317);
			f=exp();
			state._fsp--;

			match(input,8,FOLLOW_8_in_factQ319); 
			pushFollow(FOLLOW_exp_in_factQ325);
			e1=exp();
			state._fsp--;

			P.factSet((f!=null?input.toString(f.start,f.stop):null)); P.queryMaker((e1!=null?((TParser.exp_return)e1).val:null));
			// T.g:21:17: ( ',' e2= exp )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==10) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// T.g:21:18: ',' e2= exp
					{
					match(input,10,FOLLOW_10_in_factQ373); 
					pushFollow(FOLLOW_exp_in_factQ379);
					e2=exp();
					state._fsp--;

					P.queryMaker((e2!=null?((TParser.exp_return)e2).val:null));
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,9,FOLLOW_9_in_factQ452); 
			match(input,11,FOLLOW_11_in_factQ454); 
			retval.l = P.getQ(); retval.s = (f!=null?input.toString(f.start,f.stop):null); /*P.answer((e1!=null?input.toString(e1.start,e1.stop):null), (f!=null?input.toString(f.start,f.stop):null)) */
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factQ"



	// $ANTLR start "query"
	// T.g:26:1: query : '?-' factQ ;
	public final void query() throws RecognitionException {
		ParserRuleReturnScope factQ1 =null;

		try {
			// T.g:26:6: ( '?-' factQ )
			// T.g:26:17: '?-' factQ
			{
			match(input,12,FOLLOW_12_in_query529); 
			pushFollow(FOLLOW_factQ_in_query531);
			factQ1=factQ();
			state._fsp--;

			P.factChecker((factQ1!=null?((TParser.factQ_return)factQ1).s:null), (factQ1!=null?((TParser.factQ_return)factQ1).l:null)); P.queryDestroyer();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "query"


	public static class exp_return extends ParserRuleReturnScope {
		public String val;
	};


	// $ANTLR start "exp"
	// T.g:29:1: exp returns [String val] : ( ID | VAR );
	public final TParser.exp_return exp() throws RecognitionException {
		TParser.exp_return retval = new TParser.exp_return();
		retval.start = input.LT(1);

		Token ID2=null;
		Token VAR3=null;

		try {
			// T.g:30:13: ( ID | VAR )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			else if ( (LA5_0==VAR) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// T.g:30:17: ID
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_exp600); 
					retval.val = (ID2!=null?ID2.getText():null);
					}
					break;
				case 2 :
					// T.g:31:19: VAR
					{
					VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_exp667); 
					retval.val = (VAR3!=null?VAR3.getText():null);
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exp"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog40 = new BitSet(new long[]{0x0000000000001062L});
	public static final BitSet FOLLOW_fact_in_stat64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_stat68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_fact89 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_fact91 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_exp_in_fact97 = new BitSet(new long[]{0x0000000000000600L});
	public static final BitSet FOLLOW_10_in_fact145 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_exp_in_fact151 = new BitSet(new long[]{0x0000000000000600L});
	public static final BitSet FOLLOW_9_in_fact225 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_fact227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_factQ317 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_factQ319 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_exp_in_factQ325 = new BitSet(new long[]{0x0000000000000600L});
	public static final BitSet FOLLOW_10_in_factQ373 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_exp_in_factQ379 = new BitSet(new long[]{0x0000000000000600L});
	public static final BitSet FOLLOW_9_in_factQ452 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_factQ454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_query529 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_factQ_in_query531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_exp600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_exp667 = new BitSet(new long[]{0x0000000000000002L});
}
