//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x,y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x,y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, int xSpeed, int ySpeed)
	{
		super(x,y, w, h);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xSpeed, int ySpeed)
	{
		super(x,y, w, h, c);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	   
   //add the set methods
	public void setXSpeed(int x)
	{
		xSpeed = x;
	}
	
	public void setYSpeed(int y)
	{
		ySpeed = y;
	}
   
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location

	  draw(window, Color.white);
      setX(getX() + xSpeed);
      
      //setY
      setY(getY() + ySpeed);

      //draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if (obj instanceof Ball
				&& ((Ball) obj).xSpeed == xSpeed
				&& ((Ball) obj).ySpeed == ySpeed)
		{
			return true;
		}
		return false;
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

   //add a toString() method
	public String toString()
	{
		return "x speed: " + xSpeed + "y speed: " + ySpeed;
	}
}