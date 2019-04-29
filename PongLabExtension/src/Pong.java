//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private boolean[] keys;
	private BufferedImage back;
	
	private ArrayList<Block> blocks;
	private Paddle square;

	public Pong()
	{
		//set up all variables related to the game

		ball = new Ball(120, 100, 10, 10, Color.blue, 2, 1);
		square = new Paddle(400, 300, 10, 10, Color.orange, 2);
		blocks = new ArrayList<Block>();
		for(int i = 0; i<9; i++)
		{
			//top
			Block temp = new Block(70*i+80, 40, 65, 10, Color.red);
			blocks.add(temp);
			temp = new Block(70*i+80, 60, 65, 10, Color.red);
			blocks.add(temp);
			//bottom
			temp = new Block(70*i+80, 470, 65, 10, Color.red);
			blocks.add(temp);
			temp = new Block(70*i+80, 490, 65, 10, Color.red);
			blocks.add(temp);
		}
		for (int j = 0; j<6; j++)
		{
			//left
			Block temp = new Block(30, 70*j+60, 10, 65, Color.red);
			blocks.add(temp);
			temp = new Block(50, 70*j+60, 10, 65, Color.red);
			blocks.add(temp);
			//right
			temp = new Block(760, 70*j+60, 10, 65, Color.red);
			blocks.add(temp);
			temp = new Block(740, 70*j+60, 10, 65, Color.red);
			blocks.add(temp);
		}
		
		keys = new boolean[4];
    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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
		
		ball.moveAndDraw(graphToBack);
		square.draw(graphToBack);
		for(int i = 0; i<blocks.size(); i++)
		{
			blocks.get(i).draw(graphToBack);
		}
		
		//graphToBack.setColor(Color.WHITE);
		//graphToBack.fillRect(440, 520, 80, 80);
		//graphToBack.fillRect(640, 520, 100, 100);
		//graphToBack.fillRect(140, 520, 100, 100);
		//graphToBack.setColor(Color.red);
		
		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()<=530 && ball.getY()>=10))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		//see if the ball hits a block
		for (int j = 0; j<blocks.size(); j++)
		{
			Block temp = blocks.get(j);
			System.out.println(j);
			
			if((ball.getX()<=temp.getX()+temp.getWidth()+Math.abs(ball.getXSpeed()))
					&&(ball.getY()>=temp.getY()
					&& ball.getY()<=temp.getY()+temp.getHeight()
					|| ball.getY()+ball.getHeight()>=temp.getY()
					&& ball.getY()+ball.getHeight()<=temp.getY()+temp.getHeight()))
			{
				if(ball.getX()<=temp.getX()+temp.getWidth()-Math.abs(ball.getXSpeed()))
				{
					ball.setYSpeed(-ball.getYSpeed());
				}
				else
				{
					ball.setXSpeed(-ball.getXSpeed());
				}
				graphToBack.setColor(Color.white);
				graphToBack.fillRect(temp.getX(), temp.getY(), temp.getWidth(), temp.getHeight());
				blocks.remove(temp);
				break;
			}
			
			//see if the ball hits the right paddle
			else if((temp.getX()-Math.abs(ball.getXSpeed())<=ball.getX()+ball.getWidth())
					&&(ball.getY()-ball.getHeight()>=temp.getY()
					&& ball.getY()-ball.getHeight()<=temp.getY()+temp.getHeight()
					|| ball.getY()+ball.getHeight()>=temp.getY()
					&& ball.getY()+ball.getHeight()<=temp.getY()+temp.getHeight()))
			{
				if(temp.getX()+Math.abs(ball.getXSpeed())<=ball.getX()+ball.getWidth())
				{
					ball.setYSpeed(-ball.getYSpeed());
				}
				else
				{
					ball.setXSpeed(-ball.getXSpeed());
				}
				graphToBack.setColor(Color.white);
				graphToBack.fillRect(temp.getX(), temp.getY(), temp.getWidth(), temp.getHeight());
				blocks.remove(temp);
				break;
			}
		}
		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			square.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			square.moveLeftAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			square.moveDownAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			square.moveRightAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
		
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'A' : keys[1]=true; break;
			case 'S' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'A' : keys[1]=false; break;
			case 'S' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e) {}
  	}	
}