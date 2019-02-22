//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		//makes array of numbers from 1 to number
		int[] nums = new int[number];
		for (int i = 1; i<=number; i++)
		{
			nums[i] = i;
		}
		
		for(int x = 0; x<nums.length; x++)
		{
			for(int y = 0; x<nums.length; y++)
			{
				for(int z = 0; x<nums.length; z++)
				{
					
				}
			}
		}



		return 1;
	}

	public String toString()
	{
		String output="";
		
		for(int x = 0; x<number; x++)
		{
			for(int y = 0; x<number; y++)
			{
				for(int z = 0; x<number; z++)
				{
					if (Math.pow(x,2) + Math.pow(y,2) == Math.pow(z,2) && z%2 != 0
							&& ((x%2 != 0 && y%2 == 0)||(x%2 != 0 && y%2 == 0))
							&& greatestCommonFactor(x, y, z) == 1)
					{
						output += x + " "+ y + " " + z + "\n";
					}
				}
			}
		}

		return output + "\n";
	}
}