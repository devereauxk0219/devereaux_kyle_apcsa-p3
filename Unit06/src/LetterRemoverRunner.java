//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam I am",'a');
		out.println(test.toString());
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		out.println(test.toString());
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		out.println(test.toString());
		
		test.setRemover("abababababa", 'b');
		out.println(test.toString());
		
		test.setRemover("abaababababa", 'x');
		out.println(test.toString());
											
	}
}