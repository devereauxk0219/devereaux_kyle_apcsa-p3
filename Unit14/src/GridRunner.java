//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] tempStr = new String[] {"a", "b", "c", "7", "9", "x", "2"};
		Grid test = new Grid(15, 15, tempStr);
		out.println(test);
		out.println(test.findMax(tempStr));
	}
}