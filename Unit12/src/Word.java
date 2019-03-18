//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		if (rhs.word.length() < word.length())
		{
			return -1;
		}
		else if (rhs.word.length() > word.length())
		{
			return 1;
		}
		else if(rhs.word.length() == word.length())
		{
			if(word.compareTo(rhs.word) < 0)
			{
				return -1;
			}
			else if (word.compareTo(rhs.word) == 0)
			{
				return 0;
			}
			return 1;
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}