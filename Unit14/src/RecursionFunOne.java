//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*;

public class RecursionFunOne
{
	
	public static int countOddDigits(int num)
	{
		int pass = num/10;
		int test = num - pass*10;
		
		if(num > 0)
		{
			if (test%2 == 0)
			{
				return countOddDigits(pass) + 1;
			}
			return countOddDigits(pass);
		}
		return pass;
	}
}