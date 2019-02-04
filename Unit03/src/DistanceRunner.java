//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 2/1/2019
//Class - APCSA p3
//Lab  - Distance Formula

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Distance firstPoints = new Distance();
		
		System.out.println("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		System.out.println("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		System.out.println("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		System.out.println("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		
		firstPoints.setCoordinates(x1, y1, x2, y2);
		firstPoints.calcDistance();
		out.println(firstPoints.toString());
		
		Distance secondPoints = new Distance();
		
		System.out.println("Enter X1 :: ");
		x1 = keyboard.nextInt();
		System.out.println("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		System.out.println("Enter X2 :: ");
		x2 = keyboard.nextInt();
		System.out.println("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		
		secondPoints.setCoordinates(x1, y1, x2, y2);
		secondPoints.calcDistance();
		out.println(secondPoints.toString());
		
		Distance thirdPoints = new Distance();
		
		System.out.println("Enter X1 :: ");
		x1 = keyboard.nextInt();
		System.out.println("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		System.out.println("Enter X2 :: ");
		x2 = keyboard.nextInt();
		System.out.println("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		
		thirdPoints.setCoordinates(x1, y1, x2, y2);
		thirdPoints.calcDistance();
		out.println(thirdPoints.toString());
	}
}