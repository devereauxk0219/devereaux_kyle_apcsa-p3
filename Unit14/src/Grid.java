//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Random;

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		
		Random rand = new Random();

		for (int j = 0; j<grid.length; j++)
		{	
			for (int k = 0; k<grid[j].length; k++)
			{
				int randInt = rand.nextInt(vals.length);
				grid[j][k] = vals[randInt];
			}
		}
		
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String output = "";
		String most = "";
		int mostCount = 0;
		
		for (int i = 0; i<vals.length; i++)
		{
			output += vals[i] + " count is " + countVals(vals[i]) + "\n";
			if (countVals(vals[i]) > mostCount)
			{
				mostCount = countVals(vals[i]);
				most = vals[i];
			}
		}
		output += "\n" + most + " occurs the most.";
		
		return output;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		
		for (int j = 0; j<grid.length; j++)
		{
			for (int k = 0; k<grid[j].length; k++)
			{
				if (val.equals(grid[j][k]))
				{
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output = "";
		
		int tempCount = 0;
		for (int j = 0; j<grid.length; j++)
		{
			for (int k = 0; k<grid[j].length; k++)
			{
				output += grid[j][k] + " ";
			}
			output += "\n";
		}
		
		return output;
	}
}