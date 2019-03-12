//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux
//Date - 3/1/2019

import java.util.ArrayList;

public class SumFirstRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> test = new ArrayList<Integer>();
		int[] array = {-99,1,2,3,4,5,6,7,8,9,10,5};
		for (int i = 0; i<array.length; i++)
		{
			test.add(array[i]);
		}
		System.out.println(ListSumFirst.go(test));
		
		test = new ArrayList<Integer>();
		array = new int[] {10,9,8,7,6,5,4,3,2,1,-99};
		for (int i = 0; i<array.length; i++)
		{
			test.add(array[i]);
		}
		System.out.println(ListSumFirst.go(test));
		
		//first two test cases used for simplicity
	}
}