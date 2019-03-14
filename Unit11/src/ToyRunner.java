//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy("sorry");
		out.println(test.getName());
		out.println(test.getCount());
		out.println(test + "\n");
		
		Toy test2 = new Toy("ji goe");
		out.println(test2.getName());
		out.println(test2.getCount());
		out.println(test2);
	}
}