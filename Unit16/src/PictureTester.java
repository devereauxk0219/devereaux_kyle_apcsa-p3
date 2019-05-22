/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.onlyBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.onlyRed();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.onlyGreen();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture water = new Picture("water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture bike = new Picture("redMotorcycle.jpg");
    bike.explore();
    bike.mirrorVerticalRightToLeft();
    bike.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture bike = new Picture("redMotorcycle.jpg");
    bike.explore();
    bike.mirrorHorizontal();
    bike.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture bike = new Picture("redMotorcycle.jpg");
    bike.explore();
    bike.mirrorHorizontalBotToTop();
    bike.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture arms = new Picture("snowman.jpg");
    arms.explore();
    arms.mirrorArms();
    arms.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture diagonal = new Picture("beach.jpg");
    diagonal.explore();
    diagonal.mirrorDiagonal();
    diagonal.explore();
  }
  
  /** Method to test the collage method**/
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.explore();
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
	  Picture canvas = new Picture("water.jpg");
	  canvas.copy(new Picture("butterfly1.jpg"), 100, 50);
	  canvas.copy(new Picture("blueMotorcycle.jpg"), 200, 250 );
	  canvas.explore();
  }
  
  public static void testCopy2()
  {
	  Picture canvas = new Picture("water.jpg");
	  canvas.copy2(new Picture("butterfly1.jpg"), 100, 50, 150, 100);
	  canvas.copy2(new Picture("blueMotorcycle.jpg"), 200, 250, 300, 350);
	  canvas.explore();
  }
  
  public static void testMyCollage()
  {
	  Picture canvas = new Picture("water.jpg");
	  canvas.onlyBlue();
	  Picture temp = new Picture("butterfly1.jpg");
	  temp.mirrorDiagonal();
	  canvas.copy(temp, 100, 50);
	  temp = new Picture("blueMotorcycle.jpg");
	  temp.grayscale();
	  canvas.copy(temp, 200, 250 );
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEncodeDecode()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    Picture msg = new Picture("apple_icon.jpg");
    msg.explore();
    beach.encode(msg);
    beach.explore();
    beach.decode();
    beach.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  
	  
	testEncodeDecode();
	  
	  
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	//testCopy2();
    //testMyCollage();
    //testEdgeDetection();
	  
	  
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}