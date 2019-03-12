//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux
//Date - 3/1/2019

import java.util.ArrayList;;

public class DownRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> test = new ArrayList<Integer>();
		int[] tempArray = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		for (int i = 0; i<tempArray.length; i++)
		{
			test.add(tempArray[i]);
		}
		System.out.println(ListDown.go(test));
		
		//one test cases used for simplicity of code
	}
}