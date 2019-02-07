//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 2/6/2019
//Class - APCSA p3
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		int x;
		
		for (x=1;x<=8;x++) {
			StringOddOrEven test = new StringOddOrEven();
			
			out.print("Enter a word :: ");
			String inString = keyboard.next();
			test.setString(inString);
			out.println(test.toString() + "\n");
			
		}
		
	}
}