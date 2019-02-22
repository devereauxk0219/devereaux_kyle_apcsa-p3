//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		
		RockPaperScissors game = new RockPaperScissors();
		
		do {
			out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
			
			String player = keyboard.next();
			
			game.setPlayers(player);
			out.println(game);
			
			out.println("Do you want to play again?");
			response = keyboard.next();
			
		} while (response.equals("y"));
		
		
	}
}



