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
	private Card[] cards; // changed from private List<Card> cards;

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
		
		cards = new Card[ranks.length*suits.length];
		int cardsPlacement = 0;
		
		Card adder = new Card();
		for (int i = 0; i<ranks.length; i++)   // by rank - first value
		{
			for (int j = 0; j<suits.length; j++)
			{
				adder = new Card(ranks[i], suits[j], values[i]);
				cards[cardsPlacement] = adder;
				cardsPlacement++;
			}
		}
		
		if (cards != null)
		{
			size = cards.length;
		}
		
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
		Card[] output = new Card[size()];
		Card[] tempValues = cards;
		int outputCounter = 0;
		
		boolean tester = true;
		while(tester)
		{
			Random rand = new Random();
			int randInt = rand.nextInt(size());
			
			if(tempValues[randInt] != null)
			{
				output[outputCounter] = tempValues[randInt];
				tempValues[randInt] = null;
				outputCounter ++;
			}
			
			tester = false;
			for (int i = 0; i<tempValues.length; i++)
			{
				if(tempValues[i] != null)
				{
					tester = true;
				}
			}
		}
		cards = output;
		
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		
		if (size()>0)
		{
			Card output = cards[size()-1];
			
			Card[] cardsReplace = new Card[size()-1];
			for (int i = 0; i<size()-1; i++)
			{
				cardsReplace[i] = cards[i];
			}
			cards = cardsReplace;
			
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
			rtn = rtn + cards[k].toString();
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = size - 1; k >= size; k--) {
			rtn = rtn + cards[k].toString();
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - size) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
