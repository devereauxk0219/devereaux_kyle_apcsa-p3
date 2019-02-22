//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux
//Date - 2/22/2019

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		//I changed the output data type of this method from
		//boolean to int since the output of the code is supposed
		//to be the difference between two numbers (an integer).
		
		for (int i = 0; i<ray.length;i++)
		{
			if (ray[i]%2 != 0)
			{
				for (int j = i; j<ray.length;j++)
				{
					if (ray[j]%2 == 0)
					{
						return j - i;
					}
				}
			}
		}
		
		return -1;
	}
}