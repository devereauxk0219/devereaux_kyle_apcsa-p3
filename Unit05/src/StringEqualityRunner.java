//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 2/6/2019
//Class - APCSA p3
//Lab  - String Equality

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality equalTest = new StringEquality();
		
		equalTest.setWords("hello", "goodbye");
		out.println(equalTest.toString());
		
		equalTest.setWords("one", "two");
		out.println(equalTest.toString());
		
		equalTest.setWords("three", "four");
		out.println(equalTest.toString());
		
		equalTest.setWords("TCEA", "UIL");
		out.println(equalTest.toString());
		
		equalTest.setWords("State", "Champions");
		out.println(equalTest.toString());
		
		equalTest.setWords("ABC", "ABC");
		out.println(equalTest.toString());
		
		equalTest.setWords("ABC", "CBA");
		out.println(equalTest.toString());
		
		equalTest.setWords("Same", "Same");
		out.println(equalTest.toString());
		
	}
}