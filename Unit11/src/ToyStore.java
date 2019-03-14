//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	private ArrayList<Integer> stock;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
		stock = new ArrayList<Integer>();
	}

	public void loadToys(String toys)
	{
		Scanner reader = new Scanner(toys);
		
		for (int i = 0; i<toys.length(); i++)
		{
			String toyName = reader.next();
			Toy toyTemp = new Toy(toyName);
			toyList.add(toyTemp);
		}
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i<toyList.size(); i++)
  		{
  			if (toyList.get(i).getName().equals(nm))
  			{
  				return toyList.get(i);
  			}
  		}
  		
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		sortToysByCount();
  		return toyList.get(0).getName();
  	}
  
  	public void sortToysByCount()
  	{
  		
  	}
  	  
	public String toString()
	{
		String[] output = new String[toyList.size()];
		for (int i = 0; i<output.length; i++)
		{
			output[i] = toyList.get(i).toString();
		}
		return Arrays.toString(output);
	}
}