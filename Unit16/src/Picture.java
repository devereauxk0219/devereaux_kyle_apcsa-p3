import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  private static String[] codes = new String[] {"BLK", "MAG", "BLU", "GRN", "YLW", "ORG", "RED"};
  private static Color[] colors = new Color[] {Color.BLACK, Color.MAGENTA, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
  
  public void encode(Picture msg)
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel[][] msgPixels = msg.getPixels2D();
	  for (int row = 0; row<msgPixels.length; row++)
	  {
	    for (int col = 0; col<msgPixels[row].length; col++)
	    {
	       //if needs to be nullified
	       if(msgPixels[row][col].getRed() != 0 && msgPixels[row][col].getGreen() != 0 && msgPixels[row][col].getBlue() != 0)
	       {
	    	  String code = getHex(pixels[row][col].getRed()) + getHex(pixels[row][col].getGreen()) + getHex(pixels[row][col].getBlue());
	    	  
	    	  if(code.equals("BLK"))
 	    	  {
 	    		  pixels[row][col].setRed(pixels[row][col].getRed()+1);
 	    	  }
	    	  
	       }
	       else  //modification
	       {
	    	   String codeDefault = "BLK";
	    	   int red = pixels[row][col].getRed();
	    	   pixels[row][col].setRed(getRGB(red, codeDefault.substring(0,1)));
	    	   int green = pixels[row][col].getGreen();
	    	   pixels[row][col].setGreen(getRGB(green, codeDefault.substring(1,2)));
	    	   int blue = pixels[row][col].getBlue();
	    	   pixels[row][col].setBlue(getRGB(blue, codeDefault.substring(2,3)));
	       }
	    }
	  }
  }
  public void decode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	      String code = getHex(pixelObj.getRed()) + getHex(pixelObj.getGreen()) + getHex(pixelObj.getBlue());
	      
	      boolean found = false;
	      for(int i = 0; i<codes.length; i++)
	      {
	    	  if(codes[i].equals(code))
	    	  {
	    		  pixelObj.setColor(colors[i]);
	    		  found = true;
	    		  break;
	    	  }
	      }
	      if(!found)
	      {
	    	pixelObj.setColor(Color.WHITE);  
	      }
	    }
	  }
  }
  
  public int getRGB(int RGBnum, String letter)
  {
	   int colorAbove = RGBnum; int colorBelow = RGBnum;
	   while(true)
	   {
		   if(getHex(colorAbove).equals(letter))
		   {
			   return colorAbove;
		   }
		   else if (colorAbove < 255)
		   {
			   colorAbove ++;
		   }
		   if(getHex(colorBelow).equals(letter))
		   {
			   return colorBelow;
		   }
		   else if (colorBelow > 0)
		   {
			   colorBelow --;
		   }
	   }
  }
  
  public String getHex(int RGBnum)
  {
	  String hex = "";
	  if((RGBnum/10)%2 != 0)
      {
    	  hex += "4";
      } else {
    	  hex += "5";
      }
      int sumLastTwo = (RGBnum/10)%10 + RGBnum%10;
      if(sumLastTwo > 9)
      {
    	  switch((((sumLastTwo-10)*5)/8)+10)
    	  {
    	  	case(10): hex += "A"; break;
    	  	case(11): hex += "B"; break;
    	  	case(12): hex += "C"; break;
    	  	case(13): hex += "D"; break;
    	  	case(14): hex += "E"; break;
    	  	case(15): hex += "F"; break;
    	  }
      } else {
    	  hex += sumLastTwo + "";
      }
      System.out.print(RGBnum + "\t");
      return hexToString(hex);
  }
  
  public static String hexToString(String hexStr) {
	  	System.out.println(hexStr + "\t");
	  
	  	StringBuilder output = new StringBuilder("");
	    
	    for (int i = 0; i < hexStr.length(); i += 2) {
	        String str = hexStr.substring(i, i + 2);
	        output.append((char) Integer.parseInt(str, 16));
	    }
	     System.out.println(output.toString());
	    return output.toString();
	}
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void onlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setGreen(0);
	      }
	    }
  }
  
  public void onlyRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setBlue(0);
	        pixelObj.setGreen(0);
	      }
	    }
  }
  
  public void onlyGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setBlue(0);
	      }
	    }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(255-pixelObj.getRed());
	        pixelObj.setBlue(255-pixelObj.getBlue());
	        pixelObj.setGreen(255-pixelObj.getGreen());
	      }
	    }
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	int average = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen())/3;
	        pixelObj.setRed(average);
	        pixelObj.setBlue(average);
	        pixelObj.setGreen(average);
	      }
	    }
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(pixelObj.getRed()+85);
	        pixelObj.setBlue(pixelObj.getBlue());
	        pixelObj.setGreen(pixelObj.getGreen()-100);
	      }
	    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length/2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length/2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  public void mirrorArms()
  {
	  int mirrorPoint = 205;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  //mirror across for uniformity
	  for (int row = 154; row < 210; row++)
	  {
	    for (int col = 106; col < mirrorPoint; col++)
	    {
	      
	      leftPixel = pixels[row][col];      
	      rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	      rightPixel.setColor(leftPixel.getColor());
	    }
	  }
	  
	  //mirror horizontally (across y=0)
	  for (int col = 105; col<303; col++)
	  {
		  for (int row = 163; row<191; row++)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[191-row+191][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 353;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = 0; row < pixels.length; row++)
	  {
	    for (int col = 0; col < mirrorPoint; col++)
	    {
	      if (mirrorPoint-col+mirrorPoint< pixels[0].length)
	      {
	    	  leftPixel = pixels[row][col];
		      rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
		      rightPixel.setColor(leftPixel.getColor());
	      }
	    }
	  }
  }
  
  public void mirrorDiagonal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = 0; row < pixels.length; row++)
	  {
	    for (int col = 0; col <= row; col++)
	    {
	    	if(row<pixels[0].length)
	    	{
	    		pixels[row-col][row].setColor(pixels[row][row-col].getColor());
	    	}
	    }
	  }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy2(Picture fromPic, 
          int startRow, int startCol, int endRow, int endCol)
	{
	Pixel fromPixel = null;
	Pixel toPixel = null;
	Pixel[][] toPixels = this.getPixels2D();
	Pixel[][] fromPixels = fromPic.getPixels2D();
	for (int fromRow = startRow, toRow=endRow; 
	  fromRow < fromPixels.length &&
	  toRow < toPixels.length; 
	  fromRow++, toRow++)
	{
		for (int fromCol = startCol, toCol = endCol; 
		    fromCol < fromPixels[0].length &&
		    toCol < toPixels[0].length;  
		    fromCol++, toCol++)
		{
		 fromPixel = fromPixels[fromRow][fromCol];
		 toPixel = toPixels[toRow][toCol];
		 toPixel.setColor(fromPixel.getColor());
		}
	}   
}
  

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
	  //modified as instructed by the assignment
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color bottomColor = null;
    
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
    	leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        topPixel = leftPixel;
    	if (row+1 < pixels.length)
    	{
    		bottomPixel = pixels[row+1][col];
    	}
    	else
    	{
    		bottomPixel = pixels[row][col];
    	}
        
        rightColor = rightPixel.getColor();
        bottomColor = bottomPixel.getColor();
        
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist
            || topPixel.colorDistance(bottomColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
