//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 2/5/2019
//Class - APCSA p3
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		int test, x;
		
		for (x=0; x<= 4; x++) {
			out.print("Enter a whole number :: ");
			test = keyboard.nextInt();
			
			out.println(test + " is odd :: " + NumberVerify.isOdd(test));
			out.println(test + " is even :: " + NumberVerify.isEven(test));
			out.println();
		}
		
	}
}