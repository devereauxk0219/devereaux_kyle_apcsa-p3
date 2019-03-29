//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setColor(null);
		setPos(0, 0);
		setDimensions(0, 0);
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		setPos(x, y);
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setColor(c);
		setPos(x, y);
		setDimensions(w, h);
	}
	
   //add the other set methods
   public void setColor(Color col)
   {
	   color = col;
   }
	@Override
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void setDimensions(int w, int h)
	{
		width = w;
		height = h;
	}

	@Override
	public void setX(int x) {
		xPos = x;
	}

	@Override
	public void setY(int y) {
		yPos = y;
	}

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		if (obj instanceof Block
				&& ((Block) obj).xPos == xPos
				&& ((Block) obj).yPos == yPos
				&& ((Block) obj).width == width
				&& ((Block) obj).height == height
				&& ((Block) obj).color == color)
		{
			return true;
		}
		return false;
	}
	
	//add the other get methods
	@Override
	public int getX() {
		return xPos;
	}

	@Override
	public int getY() {
		return yPos;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		return "xPos: " + xPos + "\nyPos: " + yPos + "\nWidth: " + width + "\nHeight: " + height + "\nColor: " + color;
	}
}