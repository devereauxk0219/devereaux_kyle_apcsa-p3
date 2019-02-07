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
		
		equalTest.setWords("hello", "bye");
		out.println(equalTest.toString());
		
	}
}