//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 2/6/2019
//Class - APCSA p3
//Lab  - Dictionary

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare compareTest = new WordsCompare();
		
		compareTest.setWords("abe", "ape");
		out.println(compareTest.toString());
		
		compareTest.setWords("giraffe", "gorilla");
		out.println(compareTest.toString());
		
		compareTest.setWords("one", "two");
		out.println(compareTest.toString());
		
		compareTest.setWords("fun", "funny");
		out.println(compareTest.toString());
		
		compareTest.setWords("123", "19");
		out.println(compareTest.toString());
		
		compareTest.setWords("193", "1910");
		out.println(compareTest.toString());
		
		compareTest.setWords("goofy", "godfather");
		out.println(compareTest.toString());
		
		compareTest.setWords("funnel", "fun");
		out.println(compareTest.toString());
	}
}