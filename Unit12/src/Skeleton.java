//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
	private String name;
	private int size;

	//add a constructor
	public Skeleton()
	{
		name = "";
		size = 0;
	}
	public Skeleton(String nm, int sz)
	{
		name = nm;
		size = sz;
	}
	
	//add code to implement the Monster interface
	@Override
	public int getHowBig() {
		return size;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public boolean isBigger(Monster other) {
		if (other.getHowBig() < size)
		{
			return true;
		}
		else return false;
	}
	@Override
	public boolean isSmaller(Monster other) {
		if (other.getHowBig() > size)
		{
			return true;
		}
		else return false;
	}
	@Override
	public boolean namesTheSame(Monster other) {
		if (other.getName().contentEquals(name))
		{
			return true;
		}
		else return false;
	}

	//add a toString
	public String toString()
	{
		return name + " " + size;
	}
}