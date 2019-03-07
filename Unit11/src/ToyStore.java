//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i<toyList.size(); i++)
  		{
  			if (toyList.get(i).getName().equals("nm"))
  			{
  				return toyList.get(i);
  			}
  		}
  		
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}
  	  
	public String toString()
	{
	   return "";
	}
}