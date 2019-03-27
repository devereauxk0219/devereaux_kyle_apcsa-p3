import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private ArrayList<Card> cards;
	
	private ArrayList<Card> dealt; // added to keep track of dealt cards (for printing purposes).
	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		
		dealt = new ArrayList<Card>();
		
		cards = new ArrayList<Card>();
		
		Card adder = new Card();
		for (int i = 0; i<ranks.length; i++)   // by rank - first value
		{
			for (int j = 0; j<suits.length; j++)
			{
				adder = new Card(ranks[i], suits[j], values[i]);
				cards.add(adder);
			}
		}
		
		if (cards != null)
		{
			size = cards.size();
		}
		
		shuffle();
		
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		
		if (size() == 0)
		{
			return true;
		}
		else return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		
		Random rand = new Random();
		
		ArrayList<Card> output = new ArrayList<Card>();
		
		while (dealt.size() > 0)
		{
			cards.add(dealt.get(0));
			dealt.remove(0);
		}
		
		while (cards.size() > 0)
		{
			int randInt = rand.nextInt(cards.size());
			output.add(cards.get(randInt));
			cards.remove(randInt);
		}
		
		cards = output;
		size = cards.size();
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		
		if (size()>0)
		{
			Card output = cards.get(size()-1);
			
			cards.remove(size()-1);
			dealt.add(output);
			
			size --;
			
			return output;
		}
		else return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "\nsize = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k).toString();
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		
		//modified to use the dealt instance variable
		rtn = rtn + "\nDealt cards: \n";
		for (int k = 0; k<dealt.size(); k++) {
			rtn = rtn + dealt.get(k).toString();
			if (k != dealt.size()) {
				rtn = rtn + ", ";
			}
			if ((k - dealt.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
