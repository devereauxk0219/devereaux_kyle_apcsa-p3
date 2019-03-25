//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		Random rand = new Random();
		
		int[] arr = new int[size];
		
		for(int i = 0; i<size; i++)
		{
			int randInt = rand.nextInt(size) + 1;
			arr[i] = randInt;
		}
		
		out.println(Arrays.toString(arr));
		
		shiftEm(arr);
		
		return arr;
		
	}
	public static void shiftEm(int[] array)
	{
		int[] output = new int[array.length];
		int sevenCount = 0;
		
		for(int j = 0; j<array.length; j++)
		{
			if(array[j] == 7)
			{
				sevenCount ++;
				array[j] = -1;
			}
		}
		
		for(int k = 0; k<sevenCount; k++)
		{
			output[k] = 7;
		}
		
		int tempIndex = sevenCount;
		for(int m = 0; m<array.length; m++)
		{
			if(array[m] != -1)
			{
				output[tempIndex] = array[m];
				tempIndex ++;
			}
		}
		
		for(int n = 0; n<array.length; n++)
		{
			array[n] = output[n];
		}
	}
}