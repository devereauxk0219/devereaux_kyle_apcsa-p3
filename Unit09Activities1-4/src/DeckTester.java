/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		String[] suitTemp = {"A","B","C"};
		String[] rankTemp = {"Lions","Tigers", "Bears"};
		int[] pointsTemp = {1, 2, 3};
		Deck deck1 = new Deck(suitTemp, rankTemp, pointsTemp);
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1);
		
		suitTemp = new String[]{"Jack","Queen","King"};
		rankTemp = new String[]{"Spades","Hearts", "Walls"};
		pointsTemp = new int[]{11, 12, 13};
		deck1 = new Deck(suitTemp, rankTemp, pointsTemp);
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1);
		
		suitTemp = new String[]{"2","3","4"};
		rankTemp = new String[]{"Spades","Clubs", "Diamonds"};
		pointsTemp = new int[]{2, 3, 4};
		deck1 = new Deck(suitTemp, rankTemp, pointsTemp);
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1);
		
		//standard 52 card deck
		suitTemp = new String[]{"Ace", "2","3","4","5","6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		rankTemp = new String[]{"Spades","Clubs", "Diamonds", "Hearts"};
		pointsTemp = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		deck1 = new Deck(suitTemp, rankTemp, pointsTemp);
		System.out.println(deck1);
		deck1.shuffle();
		System.out.println(deck1);
		deck1.shuffle();
		System.out.println(deck1);
		
		
	}
}
