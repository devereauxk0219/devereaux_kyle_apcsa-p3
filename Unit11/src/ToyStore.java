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
		
		while (reader.hasNext())
		{
			String toyName = reader.next();
			
			boolean changed = false;
			for(int i = 0; i<toyList.size(); i++)
			{
				if (stock.size() > 0 && toyName.equals(toyList.get(i).getName()))
				{
					int tempStock = stock.get(i) + 1;
					stock.set(i, tempStock);
					changed = true;
				}
			}
			
			if(!changed)
			{
				Toy toyTemp = new Toy(toyName);
				toyList.add(toyTemp);
				stock.add(1);
			}
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
  		ArrayList<Toy> toyListOut = new ArrayList<>();
  		ArrayList<Integer> stockOut = new ArrayList<>();
  		
  		for (int i = 0; i<toyList.size(); i++)
  		{
  			int largest = 0;
  			int largestIndex = 0;
  			for (int j = 0; j<stock.size(); j++)
  			{
  				if (stock.get(j) > largest)
  				{
  					largest = stock.get(j);
  					largestIndex = j;
  				}
  			}
  			
  			toyListOut.add(toyList.get(largestIndex));
  			stockOut.add(stock.get(largestIndex));
  			
  			toyList.set(largestIndex, null);
  			stock.set(largestIndex, -1);

  		}
  		
  		toyList = toyListOut;
  		stock = stockOut;
  	}
  	  
	public String toString()
	{
		String[] output = new String[toyList.size()];
		for (int i = 0; i<output.length; i++)
		{
			output[i] = toyList.get(i).getName() + " " + stock.get(i);
		}
		return Arrays.toString(output);
	}
}