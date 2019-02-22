//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux
//Date - 2/22/2019

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int output = 0;
		
		for (int i = 0; i<ray.length; i++)
		{
			if (ray[i] > ray[ray.length-1])
			{
				output += ray[i];
			}
		}
		
		if (output == 0)
		{
			output = -1;
		}
		
		return output;
	}
}