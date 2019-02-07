//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux
//Date - 2/6/2019

public class AvgLen
{
   public static double go( String a, String b )
	{
		int lengthA = a.length();
		int lengthB = b.length();
		
		return (double) (lengthA + lengthB) / 2;
	}
}