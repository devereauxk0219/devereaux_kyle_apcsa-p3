//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect(496);
		out.println(test.toString());
		
		test.setNumber(45);
		out.println(test.toString());
		
		test.setNumber(6);
		out.println(test.toString());
		
		test.setNumber(14);
		out.println(test.toString());
		
		test.setNumber(8128);
		out.println(test.toString());
		
		test.setNumber(1245);
		out.println(test.toString());
		
		test.setNumber(33);
		out.println(test.toString());
		
		test.setNumber(28);
		out.println(test.toString());
		
		test.setNumber(27);
		out.println(test.toString());
		
		test.setNumber(33550336);
		out.println(test.toString());
		
	}
}