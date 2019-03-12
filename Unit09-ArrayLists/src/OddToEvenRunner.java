//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux
//Date - 3/1/2019

import java.util.ArrayList;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> test = new ArrayList<Integer>();
		int[] tempArray = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		for (int i = 0; i<tempArray.length; i++)
		{
			test.add(tempArray[i]);
		}
		System.out.println(ListOddToEven.go(test));
		
		test = new ArrayList<Integer>();
		tempArray = new int[] {11,9,8,7,6,5,4,3,2,1,-99,7};
		for (int i = 0; i<tempArray.length; i++)
		{
			test.add(tempArray[i]);
		}
		System.out.println(ListOddToEven.go(test));
		
		//first two test cases used for simplicity
	}
}