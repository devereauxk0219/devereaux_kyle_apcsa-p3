//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux
//Date - 2/1/2019

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double yChange = y2 - y1;
		double xChange = x2 - x1;
		
		return yChange/xChange;
	}

}