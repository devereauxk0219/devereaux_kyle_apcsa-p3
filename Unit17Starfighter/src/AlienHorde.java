//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private boolean end;

	public AlienHorde(int size, int x, int y)
	{
		end = false;
		aliens = new ArrayList<Alien>();
		for(int i = 0; i<size; i++)
		{
			aliens.add(new Alien(90*i + x, y, 50, 50, 1));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		if(!end)
		{
			for(int i = 0; i<aliens.size(); i++)
			{
				aliens.get(i).draw(window);
			}
		}
	}

	public void moveEmAll()
	{
		
		for(int i = 0; i<aliens.size(); i++)
		{
			if(aliens.get(i).isAlive())
			{
				aliens.get(i).setX(aliens.get(i).getX()+aliens.get(i).getSpeed());
			}
		}
		
		for(int i = 0; i<aliens.size(); i++)
		{
			if(aliens.get(i).isAlive()
					&& (aliens.get(i).getX() < 0 || aliens.get(i).getX() > 720))
			{
				for(int j = 0; j<aliens.size(); j++)
				{
					aliens.get(j).setSpeed(-aliens.get(j).getSpeed());
				}
				break;
			}
		}
	}
	
	public void setSpeed(int speed)
	{
		for(int i = 0; i<aliens.size(); i++)
		{
			if(aliens.get(i).isAlive())
			{
				aliens.get(i).setSpeed(speed);
			}
		}
	}
	
	public int getSpeed()
	{
		if(aliens.size()>0)
		{
			return aliens.get(0).getSpeed();
		}
		return 0;
	}
	
	public void moveDown()
	{
		for(int i = 0; i<aliens.size(); i++)
		{
			aliens.get(i).setY(aliens.get(i).getY()+Math.abs(aliens.get(i).getSpeed()));
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i = 0; i<aliens.size(); i++)
		{
			if (!aliens.get(i).isAlive())
			{
				aliens.remove(i);
			}
		}
	}
	
	public void remove(int i)
	{
		aliens.remove(i);
	}
	
	public void end()
	{
		end = true;
	}
	
	public List<Alien> getList()
	{
		return aliens;
	}
	
	public int getSize()
	{
		return aliens.size();
	}

	public String toString()
	{
		return aliens + "";
	}
}
