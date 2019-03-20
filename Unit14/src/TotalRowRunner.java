//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*;

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		
		int[][] m = new int[][] {{1, 2, 3}, {5, 5, 5, 5}};
		out.println("Row totals are :: " + TotalRow.getRowTotals(m));
		
		m = new int[][] {{1, 2, 3}, {5}, {1}, {2,2}};
		out.println("Row totals are :: " + TotalRow.getRowTotals(m));
		
		m = new int[][] {{1, 2}, {5, 5}, {5, 5,}, {4, 5, 6, 7}, {123124,12312}};
		out.println("Row totals are :: " + TotalRow.getRowTotals(m));
		
	}
}



