//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		int size = file.nextInt();
		
		ArrayList<Word> words = new ArrayList<Word>();
		for (int i = 0; i<size; i++)
		{
			file.nextLine();
			Word temp = new Word(file.next());
			words.add(temp);
		}
		
		ArrayList<Word> output = new ArrayList<Word>();
		int j = 0;
		while(output.size()<size)
		{
			boolean smallest = true;
			for (int k = 0; k<size; k++)
			{
				if (words.get(j) != null && words.get(k) != null && words.get(j).compareTo(words.get(k)) > 0)
				{
					smallest = false;
				}
			}
			
			if(smallest && words.get(j) != null)
			{
				output.add(words.get(j));
				words.set(j, null);
			}
			if(j == size-1)
			{
				j = 0;
			}
			else j++;
		}
		
		out.println(output);

	}
}