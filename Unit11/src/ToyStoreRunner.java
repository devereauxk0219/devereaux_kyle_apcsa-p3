//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore();
		test.loadToys("sorry bat sorry sorry sorry train teddy teddy ball ball");
		out.println(test);
		test.sortToysByCount();
		out.println("Sorted by frequency:");
		out.println(test);
		out.println("max == " + test.getMostFrequentToy());
	}
}