//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int numberTemp = number;
		for (int i = 0; numberTemp>0; i++)
		{
			numberTemp /= 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int length = getNumDigits(number);
		int[] sorted = new int[length];
		
		for (int i = 0; i<length; i++)
		{
			sorted[i] =  number%10;
			number /= 10;
		}
		
		Arrays.sort(sorted);
		
		return sorted;
	}
}