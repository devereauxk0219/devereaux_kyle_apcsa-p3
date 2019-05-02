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
		square = new Paddle(400, 300, 40, 40, Color.orange, 2);
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
			
			//if hits top
			if(temp.getX() <= ball.getX() && ball.getX()+ball.getWidth()<= temp.getX()+temp.getWidth()
				&& (ball.getY() < temp.getY()+temp.getHeight() && temp.getY() <= ball.getY()+ball.getHeight()))
			{
				temp.setColor(Color.white);
				temp.draw(graphToBack);
				blocks.remove(temp);
				ball.setYSpeed(-ball.getYSpeed());
				restart();
			}
			//bottom
			if(temp.getX() <= ball.getX() && ball.getX()+ball.getWidth()<= temp.getX()+temp.getWidth()
					&& (ball.getY() <= temp.getY()+temp.getHeight() &&  temp.getY() < ball.getY()+ball.getHeight()))
			{
				temp.setColor(Color.white);
				temp.draw(graphToBack);
				blocks.remove(temp);
				ball.setYSpeed(-ball.getYSpeed());
				restart();
			}
			//left
			if(temp.getY() <= ball.getY() && ball.getY()+ball.getHeight()<=temp.getY()+temp.getHeight()
					&& (temp.getX()<ball.getX()&& ball.getX()<= temp.getX()+temp.getWidth()))
			{
				temp.setColor(Color.white);
				temp.draw(graphToBack);
				blocks.remove(temp);
				ball.setXSpeed(-ball.getXSpeed());
				restart();
			}
			//right
			if(temp.getY()<=ball.getY() && ball.getY()+ball.getHeight()<=temp.getY()+temp.getHeight()
					&& (temp.getX()>ball.getX() && temp.getX() <= ball.getX()+ball.getWidth()))
			{
				temp.setColor(Color.white);
				temp.draw(graphToBack);
				blocks.remove(temp);
				ball.setXSpeed(-ball.getXSpeed());
				restart();
			}
		}
		
		//see if the ball hits the paddle top
		if(square.getX() <= ball.getX() && ball.getX()+ball.getWidth()<= square.getX()+square.getWidth()
			&& (ball.getY() < square.getY()+square.getHeight() && square.getY() <= ball.getY()+ball.getHeight()))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		//bottom
		if(square.getX() <= ball.getX() && ball.getX()+ball.getWidth()<= square.getX()+square.getWidth()
				&& (ball.getY() <= square.getY()+square.getHeight() &&  square.getY() < ball.getY()+ball.getHeight()))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		//left
		if(square.getY() <= ball.getY() && ball.getY()+ball.getHeight()<=square.getY()+square.getHeight()
				&& (square.getX()<ball.getX()&& ball.getX()<= square.getX()+square.getWidth()))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		//right
		if(square.getY()<=ball.getY() && ball.getY()+ball.getHeight()<=square.getY()+square.getHeight()
				&& (square.getX()>ball.getX() && square.getX() <= ball.getX()+ball.getWidth()))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the paddles need to be moved
		if(keys[0] == true && square.getY()>=15)
		{
			square.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true && square.getX()>=15)
		{
			square.moveLeftAndDraw(graphToBack);
		}
		if(keys[2] == true && square.getY()<=525)
		{
			square.moveDownAndDraw(graphToBack);
		}
		if(keys[3] == true && square.getX()<=775)
		{
			square.moveRightAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
		
	}
   
   public void restart()
   {
	   if (blocks.size()==0)
	   {
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
	   }
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