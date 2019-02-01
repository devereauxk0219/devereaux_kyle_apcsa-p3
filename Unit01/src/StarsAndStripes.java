//© A+ Computer Science
//www.apluscompsci.com

//Name - Kyle Devereaux
//Date - 1/31/2019
//Class - APCSA p3
//Lab  - Stars ans Sripes

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	  out.println("********************");
   }

   public void printTwentyDashes()
   {
	  out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	  out.println();
	  out.println();
   }
   
   public void printASmallBox()
   {
	  out.println("___");
	  out.println("|  |");
	  out.println("___");
   }
 
   public void printABigBox()
   { 	
	  out.println("______");
	  out.println("|     |");
	  out.println("|     |");
	  out.println("|     |");
	  out.println("______");
   }   
}