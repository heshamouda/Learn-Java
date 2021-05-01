package lecture8.poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void testConstructor() {
		// when
		Deck s= new Deck();
		
		// then
		for (int i=0; i<52; i++) {
			assertNotNull("Some null references in the deck", s.getCard(i));
		}
		for (int i=0; i<52; i++) {
			for (int j= i+1; j<52; j++)
			assertNotEquals("Two cards that are the same in the deck", s.getCard(i), s.getCard(j));
		}
	}
	
	@Test
	public void testGetNextCard() {
		// given
		Deck s= new Deck();
		
		// when
		Card card1= s.getNextCard();
		Card card2= s.getNextCard();
		Card card3= s.getNextCard();
		
		// then
		assertNotEquals("Returned two cards that are the same", card1, card2);
		assertNotEquals("Returned two cards that are the same", card2, card3);
		assertNotEquals("Returned two cards that are the same", card1, card3);
	}
	
	@Test
	public void testShuffle() {
		// given
		Deck s= new Deck();
		
		// when
		s.shuffle();
		
		// then
		for (int i=0; i<52; i++) {
			assertNotNull("Some null references in the deck", s.getCard(i));
		}
		for (int i=0; i<52; i++) {
			for (int j= i+1; j<52; j++)
			assertNotEquals("Two cards that are the same in the deck", s.getCard(i), s.getCard(j));
		}
	}

}
