//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 2/6/2019
//Class - APCSA p3
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		if (word.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

 	public String toString()
 	{
 		String output;
 		if (isEven()) {
 			output = word + " is even.";
 		} else {
 			output = word + " is odd.";
 		}
 		return output;
	}
}