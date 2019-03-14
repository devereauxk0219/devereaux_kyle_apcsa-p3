//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*;

public class Toy
{
	private String name;
	private static int count;

	public Toy()
	{
		setCount(count+1);
		setName("");
	}

	public Toy( String nm )
	{
		setCount(count+1);
		setName(nm);
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return name + " " + count;
	}
}