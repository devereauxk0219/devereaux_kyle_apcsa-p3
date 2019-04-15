//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {
	   super(x,y);
	   setXSpeed(3);
	   setYSpeed(1);
   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
	   super(x,y,wid,ht);
	   setXSpeed(3);
	   setYSpeed(1);
   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
   }

   public Color randomColor()
   {
	   Random rand = new Random();
	   int randInt = rand.nextInt(255) + 1;
	   
	   int r = randInt;
	   randInt = rand.nextInt(255) + 1;
	   int g = randInt;
	   randInt = rand.nextInt(255) + 1;
	   int b = randInt;
	   
	   return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   
	   setX(getX() + getXSpeed());
	   setY(getY() + getYSpeed());

	   draw(window);
   }
   
}