//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10, 10, 10);
		speed = 5;
   }

   //add the other Paddle constructors
   public Paddle(int x, int y)
   {
	   super(x, y, 20, 40, Color.red);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int speed)
   {
	   super(x, y, 20, 40, Color.red);
	   this.speed = speed;
   }
   
   public Paddle(int x, int y, int w, int h, int speed)
   {
	   super(x, y, w, h);
	   this.speed = speed;
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int speed)
   {
	   super(x, y, w, h, c);
	   this.speed = speed;
   }


   public void moveUpAndDraw(Graphics window)
   {
	   draw(window,Color.white);
	   setY(getY() - getSpeed());
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window,Color.white);
	   setY(getY() + getSpeed());
	   draw(window);
   }

   //add get methods
   @Override
   public int getX() {
		return super.getX();
	}

	@Override
	public int getY() {
		return super.getY();
	}
	
	public int getWidth() {
		return super.getWidth();
	}
	
	public int getHeight() {
		return super.getHeight();
	}
	
	public int getSpeed()
	{
		return speed;
	}
   
   //add a toString() method
   public String toString()
   {
	   return super.toString() +  "\nSpeed: " + speed + "\n";
   }
   
   
}