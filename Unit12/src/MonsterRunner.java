//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		char response = 'Y';
		
		do
		{
			//ask for name and size
			out.println("Enter 1st monster's name : ");
			String name1 = keyboard.next();
			out.println("Enter 1st monster's size : ");
			int size1 = keyboard.nextInt();
			//instantiate monster one
			Skeleton monster1 = new Skeleton(name1, size1);
			
			//ask for name and size
			out.println("Enter 2st monster's name : ");
			String name2 = keyboard.next();
			out.println("Enter 2st monster's size : ");
			int size2 = keyboard.nextInt();
			//instantiate monster two
			Skeleton monster2 = new Skeleton(name2, size2);
			
			out.println("Monster 1 - " + monster1);
			out.println("Monster 2 - " + monster2);
			
			if(monster1.isBigger(monster2))
			{
				out.println("Monster one is bigger than Monster two.");
			}
			else if (monster1.isSmaller(monster2))
			{
				out.println("Monster one is smaller than Monster two.");
			}
			else out.println("Monster one is the same size as Monster two.");
			
			if(monster1.namesTheSame(monster2))
			{
				out.println("Monster one has the same name as Monster two.");
			}
			else out.println("Monster one does not have the same name as Monster two.");
			
			out.println("Test other cases? : ");
			response = keyboard.next().charAt(0);
			
		} while(response == 'Y' || response == 'y');
		
		
	}
}