//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne test = new TriangleOne("hippo");
		test.print();
		
		test.setWord("abcd");
		test.print();
		
		test.setWord("it");
		test.print();
		
		test.setWord("a");
		test.print();
		
		test.setWord("chicken");
		test.print();
	}
}