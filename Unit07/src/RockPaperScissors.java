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
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
		compChoice = "";
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		
		Random rand = new Random();
		int compChoiceNum = rand.nextInt(3)+1;
		
		switch (compChoiceNum)
		{
			case 1: compChoice = "Rock";
					break;
			case 2: compChoice = "Paper";
					break;
			case 3: compChoice = "Scissors";
					break;
			default: compChoice = "";
					break;
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		if (playChoice.equals("Rock"))
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
		else if (playChoice.equals("Paper"))
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
		else if (playChoice.equals("Scissors"))
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
			
			if (playChoice.equals("Rock"))
			{
				output += "Rock Breaks " + compChoice + ">>!\n";
			}
			else if (playChoice.equals("Paper"))
			{
				output += "Paper Covers " + compChoice + ">>!\n";
			}
			else if (playChoice.equals("Scissors"))
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