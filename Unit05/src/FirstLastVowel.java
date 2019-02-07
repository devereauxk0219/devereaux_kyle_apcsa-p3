//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Devereaux
//Date - 2/7/2019


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String[] vowels = new String[] {"a", "e", "i", "o", "u"};
	   int x;
	   
	   for(x=0;x<=4;x++) {
		   if (vowels[x].equals(a.substring(0,1)) || vowels[x].equals(a.substring(a.length()-1))) {
			   return "yes";
		   }
	   }
	   return "no";
	}
}