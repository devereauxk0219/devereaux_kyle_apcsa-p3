//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 2/4/2019
//Class - APCSA p3
//Lab  - Miles per hour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();
		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();
		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour firstCompute = new MilesPerHour(dist, hrs, mins);
		firstCompute.calcMPH();
		out.println(firstCompute.toString());
		
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();
		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();
		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		MilesPerHour secondCompute = new MilesPerHour(dist, hrs, mins);
		secondCompute.calcMPH();
		out.println(secondCompute.toString());
		
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();
		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();
		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		MilesPerHour thirdCompute = new MilesPerHour(dist, hrs, mins);
		thirdCompute.calcMPH();
		out.println(thirdCompute.toString());
		
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();
		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();
		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		MilesPerHour fourthCompute = new MilesPerHour(dist, hrs, mins);
		fourthCompute.calcMPH();
		out.println(fourthCompute.toString());
		
	}
}