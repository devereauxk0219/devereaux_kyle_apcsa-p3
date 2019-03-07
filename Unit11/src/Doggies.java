//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		int outputAge = pups[0].getAge();
		
		for (int i = 1; i<pups.length; i++)
		{
			if (pups[i].getAge() > outputAge)
			{
				outputAge = pups[i].getAge();
			}
		}
		
		for (int j = 0; j<pups.length; j++)
		{
			if (pups[j].getAge() == outputAge)
			{
				return pups[j].getName();
			}
		}
		
		return "";
	}

	public String getNameOfYoungest()
	{
		int outputAge = pups[0].getAge();
		
		for (int i = 1; i<pups.length; i++)
		{
			if (pups[i].getAge() < outputAge)
			{
				outputAge = pups[i].getAge();
			}
		}
		
		for (int j = 0; j<pups.length; j++)
		{
			if (pups[j].getAge() == outputAge)
			{
				return pups[j].getName();
			}
		}
		
		return "";
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}