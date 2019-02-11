//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
   public Perfect()
   {
	   number = 0;
   }
   
   public Perfect(int number)
   {
	   this.number = number;
   }

   public void setNumber(int number)
   {
	   this.number = number;
   }

	public boolean isPerfect()
	{
		int sum = 0;
		int i;
		for (i=1;i<number;i++)
		{
			if (number%i == 0)
			{
				sum += i;
			}
		}
		
		if (sum == number)
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		if (isPerfect())
		{
			return number + " is perfect.\n";
		} else {
			return number + " is not perfect.\n";
		}
	}
	
}