//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		int x;
		
		for(x=0; x <= str.length()-2; x++) {
			if (str.substring(x, x+1).equals(str.substring(x+1, x+2))) {
				count ++;
			}
		}
		
		return count;
	}
}