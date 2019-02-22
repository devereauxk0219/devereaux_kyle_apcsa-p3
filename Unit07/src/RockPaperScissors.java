//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Kyle Devereaux

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers(" ");
		compChoice = " ";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
		compChoice = "";
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		compChoice = "";
	}

	public String determineWinner()
	{
		String winner="";
		
		Random rand = new Random();
		int compChoiceNum = rand.nextInt(2);
		
		switch (compChoiceNum)
		{
			case 0: compChoice = "Rock";
			case 1: compChoice = "Paper";
			case 2: compChoice = "Scissors";
		}
		
		if (playChoice.equals("R"))
		{
			if (compChoice.equals("Paper"))
			{
				winner = "computer";
			}
			else if (compChoice.equals("Scissors"))
			{
				winner = "player";
			}
		}
		else if (playChoice.equals("P"))
		{
			if (compChoice.equals("Scissors"))
			{
				winner = "computer";
			}
			else if (compChoice.equals("Rock"))
			{
				winner = "player";
			}
		}
		else if (playChoice.equals("S"))
		{
			if (compChoice.equals("Rock"))
			{
				winner = "computer";
			}
			else if (compChoice.equals("Paper"))
			{
				winner = "player";
			}
		}
		
		return winner;
	}

	public String toString()
	{
		String output = "";
		
		if (determineWinner().equals("player"))
		{
			output += "player had " + playChoice + "\ncomputer had " + compChoice + "\n!Player wins <<";
			
			if (playChoice.equals("R"))
			{
				output += "Rock Breaks " + compChoice + ">>!\n";
			}
			else if (playChoice.equals("P"))
			{
				output += "Paper Covers " + compChoice + ">>!\n";
			}
			else if (playChoice.equals("S"))
			{
				output += "Scissors Cuts " + compChoice + ">>!\n";
			}
		}
		else if (determineWinner().equals("computer"))
		{
			output += "player had " + playChoice + "\ncomputer had " + compChoice + "\n!Computer wins <<";
			
			if (compChoice.equals("Rock"))
			{
				output += "Rock Breaks " + playChoice + ">>!\n";
			}
			else if (compChoice.equals("Paper"))
			{
				output += "Paper Covers " + playChoice + ">>!\n";
			}
			else if (compChoice.equals("Scissors"))
			{
				output += "Scissors Cuts " + playChoice + ">>!\n";
			}
		}
		else
		{
			output += "!Draw Game!\n";
		}
		
		return output;
	}
}