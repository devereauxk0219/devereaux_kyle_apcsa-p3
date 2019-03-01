//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		//I changed the output data type of this method from
		//boolean to int since the output of the code is supposed
		//to be the difference between two numbers (an integer).
	
		for (int i = 0; i<ray.size(); i++)
		{
			if (ray.get(i)%2 != 0)
			{
				for (int j = ray.size()-1; j>i; j--)
				{
					if (ray.get(j)%2 == 0)
					{
						return j - i;
					}
				}
			}
		}
		
		return -1;
	}
}