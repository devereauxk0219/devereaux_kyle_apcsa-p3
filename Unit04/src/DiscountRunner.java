//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 2/5/2019
//Class - APCSA p3
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Discount bill = new Discount();
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.printf("Bill after discount :: " + String.format("%.2f\n\n", bill.getDiscountedBill(amt)));
		
		Discount bill1 = new Discount();
		out.print("Enter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		out.printf("Bill after discount :: " + String.format("%.2f\n\n", bill1.getDiscountedBill(amt1)));
		
		Discount bill2 = new Discount();
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		out.printf("Bill after discount :: " + String.format("%.2f\n\n", bill2.getDiscountedBill(amt2)));
		
		Discount bill3 = new Discount();
		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		out.printf("Bill after discount :: " + String.format("%.2f\n\n", bill3.getDiscountedBill(amt3)));
		
		Discount bill4 = new Discount();
		out.print("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		out.printf("Bill after discount :: " + String.format("%.2f\n\n", bill4.getDiscountedBill(amt4)));
		
	}
}