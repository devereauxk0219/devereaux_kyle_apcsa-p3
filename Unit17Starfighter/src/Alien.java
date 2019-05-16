//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private boolean alive;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		this(x, y, 30, 30, 0);
	}

	public Alien(int x, int y, int s)
	{
		this(x, y, 30, 30, s);
		alive = true;
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		alive = true;
		try
		{
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   if(direction.equals("LEFT"))
		{
			setX(getX()-getSpeed());
		}
		else if (direction.equals("RIGHT"))
		{
			setX(getX()+getSpeed());
		}
		else if (direction.equals("UP"))
		{
			setY(getY()-getSpeed());
		}
		else if (direction.equals("DOWNN"))
		{
			setY(getY()+getSpeed());
		}
	}
   
    public void remove()
    {
    	setX(-100);
    	setY(-100);
    	setSpeed(0);
    	alive = false;
    }
    
    public boolean isAlive()
    {
    	return alive;
    }

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
