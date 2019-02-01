//(c) One+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 1/31/2019
//Class - OnePCSOne p3
//Lab  - Variables

public class Variables
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String
		
		byte byteOne;
		short shortOne;
		int intOne;
		long longOne;
		float floatOne;
		double doubleOne;
		char charOne;
		boolean booleanOne;
		String stringOne;

		//integer variables
		byteOne = 127;
		shortOne = 7;
		intOne = 4;
		longOne = 20;

		//decimal variables
		floatOne = 1;
		doubleOne = 2.1;

		//other integer types
		charOne = 'b';

		//other types
		booleanOne = false;
		stringOne = "Roof";

		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16 bit - shortOne = "+shortOne+"\t\t*");
		System.out.println("*32 bit - intOne = "+intOne+"\t\t*");
		System.out.println("*64 bit - longOne = "+longOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*          real types           *");
		System.out.println("*                               *");
		System.out.println("*32 bit - floatOne = "+floatOne+"\t*");
		System.out.println("*64 bit - doubleOne = "+doubleOne+"\t*");
		System.out.println("*                               *");
		System.out.println("*      other integer types      *");
		System.out.println("*                               *");
		System.out.println("*16 bit - charOne = "+charOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*         other types           *");
		System.out.println("*                               *");
		System.out.println("*booleanOne = "+booleanOne+"\t\t*");
		System.out.println("*stringOne = "+stringOne+"\t\t*");
		System.out.println("/////////////////////////////////");
		
	}
}