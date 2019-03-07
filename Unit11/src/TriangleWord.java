//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		int letter = 1;
		
		for (int i = 0; i<word.length(); i++)
		{
			String tempOutput = "";
			
			for (int j = 0; j<letter; j++)
			{
				tempOutput += word.substring(0, letter);
			}
			letter ++;
			out.println(tempOutput);
		}
	}
}