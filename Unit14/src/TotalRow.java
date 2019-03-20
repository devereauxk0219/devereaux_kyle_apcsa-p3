//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList<Integer> output = new ArrayList<Integer>();
    	
    	for (int i = 0; i<m.length; i++)
    	{
    		int tempSum = 0;
    		for (int j = 0; j<m[i].length; j++)
    		{
    			tempSum += m[i][j];
    		}
    		output.add(tempSum);
    	}
    	
    	return output;
    }
}
