//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
	private int xSpeed;
	private int ySpeed;

   public SpeedUpBall()
   {
	   super(0, 0);
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x,y);
   }

   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x,y);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y, wid, ht);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y, wid, ht, col);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }

   public void setXSpeed( int xSpd )
   {
	   setXSpeed(xSpd);
   }

   public void setYSpeed( int ySpd )
   {
	   setYSpeed(ySpd);
   }
   
}

