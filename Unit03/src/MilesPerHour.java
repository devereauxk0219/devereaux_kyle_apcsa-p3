//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 2/4/2019
//Class - APCSA p3
//Lab  - Miles per hour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
		mph = 0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double seconds = (hours * 60) + minutes;
		mph = 60 * distance / seconds;
	}

	public void print()
	{
		out.println(distance + " miles in " + hours + " hour and " + minutes + " minutes = " + mph + " MPH.");
	}
	
	public String toString()
	{
		return distance + " miles in " + hours + " hour and " + minutes + " minutes = " + String.format("%.0f", mph) + " MPH.\n\n";
	}
}