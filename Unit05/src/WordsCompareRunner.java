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
		
		compareTest.setWords("funnel", "fun");
		compareTest.compare();
		out.println(compareTest.toString());
	}
}