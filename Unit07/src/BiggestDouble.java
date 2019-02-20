//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Kyle Devereaux

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double[] nums = new double[] {one, two, three, four};
		
		for (int i = 0; i<nums.length; i++)
		{
			boolean tester = true;
			
			for (int x = 0; x<nums.length; x++)
			{
				if (nums[x] > nums[i])
				{
					tester = false;
				}
			}
			
			if (tester)
			{
				return nums[i];
			}
		}
		
		return 0.0;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four + "\nbiggest = " + getBiggest() + "\n";
	}
}