//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	
	private AlienHorde horde1;
	private AlienHorde horde2;
	private Bullets shots;
	private boolean reloaded;
	private int ticker;
	private int continuousTicker;
	
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		ship = new Ship(380, 400, 50, 50, 3);
		horde1 = new AlienHorde(8, 50, 25);
		horde2 = new AlienHorde(8, 75, 75);
		horde2.setSpeed(-horde2.getSpeed());
		shots = new Bullets();
		
		reloaded = true;
		ticker = 0;
		continuousTicker = 0;
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 20 );
		
		if(horde1.getSize()==0 && horde2.getSize()==0)
		{
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("WINNER", 400, 300);
			twoDGraph.drawImage(back,null,0 ,0);
			ship.end();
		}

		//add code to move Ship, Alien, etc.
		if(keys[0] == true && ship.getX()>0)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true && ship.getX()<720)
		{
			ship.move("RIGHT");
		}
		if(keys[2]==true && ship.getY()>0)
		{
			ship.move("UP");
		}
		if(keys[3]== true && ship.getY()<500)
		{
			ship.move("DOWN");
		}
		if(keys[4]==true && reloaded)
		{
			shots.add(new Ammo(ship.getX()+20, ship.getY(), 3));
			reloaded = false;
			ticker = 0;
		}
		
		shots.moveEmAll();
		
		horde1.moveEmAll();
		horde2.moveEmAll();

		if(continuousTicker%12==0)
		{
			horde1.moveDown();
			horde2.moveDown();
		}

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		ArrayList<Alien> alienList = (ArrayList<Alien>) horde1.getList();
		java.util.List<Ammo> bulletsList = shots.getList();
		for(int i = 0; i<alienList.size(); i++)
		{
			Alien tempAlien = alienList.get(i);
			
			for(int j = 0; j<bulletsList.size(); j++)
			{
				Ammo tempBullet = bulletsList.get(j);
				
				if(((tempBullet.getX()<tempAlien.getX() && tempBullet.getX()+tempBullet.getWidth() < tempAlien.getX())
						|| !(tempAlien.getX()<tempBullet.getX() && tempAlien.getX()+tempAlien.getWidth() < tempBullet.getX()))
						&& (tempBullet.getY() < tempAlien.getY() && tempBullet.getY()+tempBullet.getHeight() > tempAlien.getY()))
				{
					shots.remove(j);
					horde1.remove(i);
				}
			}
			if((((ship.getX()<tempAlien.getX() && ship.getX()+ship.getWidth() < tempAlien.getX())
					|| !(tempAlien.getX()<ship.getX() && tempAlien.getX()+tempAlien.getWidth() < ship.getX()))
					&& (ship.getY() < tempAlien.getY() && ship.getY()+ship.getHeight() > tempAlien.getY()))
					|| tempAlien.getY()+tempAlien.getHeight() >= ship.getY())
			{
				graphToBack.setColor(Color.RED);
				graphToBack.drawString("LOSER", 400, 300);
				twoDGraph.drawImage(back,null,0 ,0);
				ship.end();
				horde1.end();
				horde2.end();
			}
		}
		
		alienList = (ArrayList<Alien>) horde2.getList();
		for(int i = 0; i<alienList.size(); i++)
		{
			Alien tempAlien = alienList.get(i);
			
			for(int j = 0; j<bulletsList.size(); j++)
			{
				Ammo tempBullet = bulletsList.get(j);
				
				if(((tempBullet.getX()<tempAlien.getX() && tempBullet.getX()+tempBullet.getWidth() < tempAlien.getX())
						|| !(tempAlien.getX()<tempBullet.getX() && tempAlien.getX()+tempAlien.getWidth() < tempBullet.getX()))
						&& (tempBullet.getY() < tempAlien.getY() && tempBullet.getY()+tempBullet.getHeight() > tempAlien.getY()))
				{
					shots.remove(j);
					horde2.remove(i);
				}
			}
			if((((ship.getX()<tempAlien.getX() && ship.getX()+ship.getWidth() < tempAlien.getX())
					|| !(tempAlien.getX()<ship.getX() && tempAlien.getX()+tempAlien.getWidth() < ship.getX()))
					&& (ship.getY() < tempAlien.getY() && ship.getY()+ship.getHeight() > tempAlien.getY()))
					|| tempAlien.getY()+tempAlien.getHeight() >= ship.getY())
			{
				graphToBack.setColor(Color.RED);
				graphToBack.drawString("LOSER", 400, 300);
				twoDGraph.drawImage(back,null,0 ,0);
				ship.end();
				horde1.end();
				horde2.end();
			}
		}
		
		if (ticker >= 150)
		{
			reloaded = true;
		}
		else
		{
			ticker++;
		}
		continuousTicker++;
		
		shots.drawEmAll(graphToBack);
		ship.draw(graphToBack);
		horde1.drawEmAll(graphToBack);
		horde2.drawEmAll(graphToBack);
		twoDGraph.drawImage(back, null, 0, 0);
		
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

