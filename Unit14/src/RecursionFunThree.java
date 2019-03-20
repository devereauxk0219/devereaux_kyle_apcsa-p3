//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	public static int luckyThrees( long number )
	{
		long pass = number/10;
		long test = number - pass*10;
		
		if(number>0)
		{
			if(test == 3 && pass>10)
			{
				return luckyThrees(pass) + 1;
			}
			return luckyThrees(pass);
		}
		return (int)pass;
	}
}