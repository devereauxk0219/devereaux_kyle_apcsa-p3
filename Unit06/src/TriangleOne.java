//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word = "";
	}

	public TriangleOne(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		//the assignment seems to want me to print in the class,
		// so this is what I'm doing.
		int i;
		for (i=0;i < word.length();i++) {
			out.println(word.substring(0,word.length()-i));
		}
		out.println();
	}
}