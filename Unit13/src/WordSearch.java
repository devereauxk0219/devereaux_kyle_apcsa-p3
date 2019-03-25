//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	
    	int k = 0;
    	for (int i = 0; i<size; i++)
    	{
    		for (int j = 0; j<size; j++)
    		{
    			m[i][j] = Character.toString(str.charAt(k));
    			k++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i<m.length; i++)
    	{
    		for (int j = 0; j<m[i].length; j++)
    		{
    			if (checkRight(word, i, j) || checkLeft(word, i, j)
    					|| checkUp(word, i, j) || checkDown(word, i, j)
    					|| checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j)
    					|| checkDiagDownRight(word, i, j) || checkDiagDownLeft(word, i, j))
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c) throws ArrayIndexOutOfBoundsException
	{
		for (int i = 0; i<w.length(); i++)
		{
			if (w.charAt(i) != m[r][c+i].charAt(0))
			{
				return false;
			}
		}
			
		return true;
	}

	public boolean checkLeft(String w, int r, int c) throws ArrayIndexOutOfBoundsException
	{
		for (int i = 0; i<w.length(); i++)
		{
			if (w.charAt(i) != m[r][c-i].charAt(0))
			{
				return false;
			}
		}
		
		return true;
	}

	public boolean checkUp(String w, int r, int c) throws ArrayIndexOutOfBoundsException
	{
		for (int i = 0; i<w.length(); i++)
		{
			if (w.charAt(i) != m[c][r-i].charAt(0))
			{
				return false;
			}
		}
			
		return true;
	}

	public boolean checkDown(String w, int r, int c) throws ArrayIndexOutOfBoundsException
	{
		for (int i = 0; i<w.length(); i++)
		{
			if (w.charAt(i) != m[c][r+i].charAt(0))
			{
				return false;
			}
		}
			
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
		String output = "";
		
		for (int j = 0; j<m.length; j++)
		{
			for (int k = 0; k<m[j].length; k++)
			{
				output += m[j][k] + " ";
			}
			output += "\n";
		}
		
		return output;
    }
}
