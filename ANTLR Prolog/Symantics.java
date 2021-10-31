import java.util.*;

public class Symantics {
	public static HashMap<String, ArrayList<ArrayList<String>>> facts = new HashMap<String, ArrayList<ArrayList<String>>>();
	public static HashMap<String, Boolean> done = new HashMap<String, Boolean>();
	public static ArrayList<String> currentQ = new ArrayList<>();
	public static String currentF;
	public static char[] caps = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	public static void printHM() {System.out.println(facts);}

	public static void factMaker(String fact, String literal)
	{
		if (!facts.containsKey(fact)) {facts.put(fact, new ArrayList<>()); done.put(fact, true);}

		if (done.get(fact))
		{
			facts.get(fact).add(new ArrayList<>());
			done.replace(fact, false);
		}
		if (!done.get(fact))
		{
			facts.get(fact).get(facts.get(fact).size()-1).add(literal);
		}
	}

	public static void Done(String fact)
	{
		done.replace(fact, true);
	}

	public static ArrayList<String> getQ()
	{
		System.out.print("Query: ");
		System.out.print(currentF);
		System.out.print(currentQ);
		System.out.println();
		return currentQ;
	}

	public static void factSet(String fact)
	{
		currentF = fact;
	}

	public static void queryMaker(String literal)
	{
		currentQ.add(literal);
	}

	public static void queryDestroyer()
	{
		currentQ.clear();
	}

	public static void factChecker(String fact, ArrayList<String> query)
	{
		ArrayList<ArrayList<String>> assign = facts.get(fact);

		for (int i=0; i<assign.size(); i++)
		{
			if (assign.get(i).equals(currentQ))
			{
				System.out.print("Match: " );
				System.out.print(fact);
				System.out.print(assign.get(i));
				System.out.println();
				System.out.print("Yes.");
				System.out.println();
				System.out.println();
				return;
			}
		}
		System.out.print("No.");
		System.out.println();
		System.out.println();
	}

	public static void answer(String var, String fact)
	{
		for (int i=0; i<26; i++)
		{
			if (caps[i] == var.charAt(0)) find(fact);
		}
	}
	/*
	public static ArrayList<String> cloneList(ArrayList<String> list)
	{
		ArrayList<String> clone = new ArrayList<String>();
		Iterator<String> iterator = list.iterator();

		while(iterator.hasNext())
		{
    		clone.add((String) iterator.next().clone());  
		}
	}
	*/
	public static void find(String fact)
	{
		ArrayList<ArrayList<String>> varCheck = facts.get(fact);
		ArrayList<String> check = /*cloneList*/(currentQ);

		for (int i=0; i<varCheck.size()-1; i++)
		{
			ArrayList<String> factCheck = varCheck.get(i);
			for (int j=0; j<factCheck.size()-1; j++)
			{
				if (check.size() != factCheck.size()) break;
				if (check.get(i) != factCheck.get(i))
				{
					System.out.print(check.get(i));
					System.out.print(" = ");
					System.out.print(factCheck.get(i));
					System.out.println();
				}
			}
			
		}
	}
}