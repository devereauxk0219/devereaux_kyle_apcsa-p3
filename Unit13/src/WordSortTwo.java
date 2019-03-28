//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		Scanner str = new Scanner(sentence);
		wordRay = new String[0];
		
		while (str.hasNext())
		{
			wordRay = Arrays.copyOf(wordRay, wordRay.length+1);
			wordRay[wordRay.length-1] = str.next();
		}
		
	}

	public void sort()
	{
		//Arrays.sort(wordRay);
		
		String[] output = new String[wordRay.length];
	
		for (int i = 0; i<wordRay.length; i++)
		{
			String smallest = wordRay[0];
			int smallestIndex = 0;
			for (int j = 0; j<wordRay.length; j++)
			{
				if (!wordRay[j].equals("null") && wordRay[j].compareTo(smallest)<0)
				{
					smallest = wordRay[j];
					smallestIndex = i;
				}
			}
			
			wordRay[smallestIndex] = "null";
			output[i] = smallest;
		}
		
		wordRay = output;
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i<wordRay.length; i++)
		{
			output += wordRay[i] + "\n";
		}
		return output + "\n\n";
	}
}