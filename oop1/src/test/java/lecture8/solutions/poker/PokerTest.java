package lecture8.solutions.poker;

import lecture8.poker.Card;
import lecture8.poker.Poker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokerTest {

	@Test
	public void testSortierung() {
		// given
		lecture8.poker.Card[] cards1= {new lecture8.poker.Card(1, 14), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(1, 12), new lecture8.poker.Card(1, 11), new lecture8.poker.Card(1, 10)};
		lecture8.poker.Card[] cards2= {new lecture8.poker.Card(1, 10), new lecture8.poker.Card(1, 11), new lecture8.poker.Card(1, 12), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(1, 14)};
		lecture8.poker.Card[] cards3= {new lecture8.poker.Card(1, 3), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(1, 5), new lecture8.poker.Card(1, 14), new lecture8.poker.Card(1, 10)};
		lecture8.poker.Card[] cards4= {new lecture8.poker.Card(1, 6), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(2, 6), new lecture8.poker.Card(3, 9), new lecture8.poker.Card(4, 13)};
		// when
		lecture8.poker.Poker.sortCards(cards1);
		lecture8.poker.Poker.sortCards(cards2);
		lecture8.poker.Poker.sortCards(cards3);
		lecture8.poker.Poker.sortCards(cards4);
		// then
		assertEquals(14, cards1[0].getValue());
		assertEquals(13, cards1[1].getValue());
		assertEquals(12, cards1[2].getValue());
		assertEquals(11, cards1[3].getValue());
		assertEquals(10, cards1[4].getValue());
		
		assertEquals(14, cards2[0].getValue());
		assertEquals(13, cards2[1].getValue());
		assertEquals(12, cards2[2].getValue());
		assertEquals(11, cards2[3].getValue());
		assertEquals(10, cards2[4].getValue());
		
		assertEquals(14, cards3[0].getValue());
		assertEquals(13, cards3[1].getValue());
		assertEquals(10, cards3[2].getValue());
		assertEquals(5, cards3[3].getValue());
		assertEquals(3, cards3[4].getValue());
		
		assertEquals(13, cards4[0].getValue());
		assertEquals(13, cards4[1].getValue());
		assertEquals(9, cards4[2].getValue());
		assertEquals(6, cards4[3].getValue());
		assertEquals(6, cards4[4].getValue());
	}
	
	@Test
	public void testTestRoyalFlush() {
		// given
		lecture8.poker.Card[] cards1= {new lecture8.poker.Card(1, 14), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(1, 12), new lecture8.poker.Card(1, 11), new lecture8.poker.Card(1, 10)};
		// when
		String text1= lecture8.poker.Poker.testCards(cards1);
		// then
		assertEquals("Royal Flush in the color Spade", text1);
	}
	
	@Test
	public void testTestStraightFlush() {
		// given
		lecture8.poker.Card[] cards1= {new lecture8.poker.Card(1, 10), new lecture8.poker.Card(1, 9), new lecture8.poker.Card(1, 8), new lecture8.poker.Card(1, 7), new lecture8.poker.Card(1, 6)};
		// when
		String text1= lecture8.poker.Poker.testCards(cards1);
		// then
		assertEquals("Straight Flush in the color Spade", text1);
	}
	
	@Test
	public void testTestFlush() {
		// given
		lecture8.poker.Card[] cards1= {new lecture8.poker.Card(1, 4), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(1, 10), new lecture8.poker.Card(1, 7), new lecture8.poker.Card(1, 6)};
		// when
		String text1= lecture8.poker.Poker.testCards(cards1);
		// then
		assertEquals("Flush in the color Spade", text1);
	}
	
	@Test
	public void testTestVierlinge() {
		// given
		lecture8.poker.Card[] cards1= {new lecture8.poker.Card(1, 6), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(2, 6), new lecture8.poker.Card(3, 6), new lecture8.poker.Card(4, 6)};
		// when
		String text1= lecture8.poker.Poker.testCards(cards1);
		// then
		assertEquals("Four Of A Kind (Quads.)", text1);
	}
	
	@Test
	public void testTestFullHouse() {
		// given
		lecture8.poker.Card[] cards1= {new lecture8.poker.Card(1, 6), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(2, 6), new lecture8.poker.Card(3, 13), new lecture8.poker.Card(4, 6)};
		// when
		String text1= lecture8.poker.Poker.testCards(cards1);
		// then
		assertEquals("Full House.", text1);
	}
	
	@Test
	public void testTestDrillinge() {
		// given
		lecture8.poker.Card[] cards1= {new lecture8.poker.Card(1, 6), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(2, 6), new lecture8.poker.Card(3, 9), new lecture8.poker.Card(4, 6)};
		// when
		String text1= lecture8.poker.Poker.testCards(cards1);
		// then
		assertEquals("Three of a kind.", text1);
	}
	
	@Test
	public void testTestTwoPairs() {
		// given
		lecture8.poker.Card[] cards1= {new lecture8.poker.Card(1, 6), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(2, 6), new lecture8.poker.Card(3, 9), new lecture8.poker.Card(4, 13)};
		lecture8.poker.Card[] cardsTwoPairs = {new lecture8.poker.Card(1, 12),new lecture8.poker.Card(2, 12),new lecture8.poker.Card(1, 2),
				new lecture8.poker.Card(3, 8),new lecture8.poker.Card(4, 8)};
		// when
		String text1= lecture8.poker.Poker.testCards(cards1);
		String textTwoPairs= lecture8.poker.Poker.testCards(cardsTwoPairs);
		// then
		assertEquals("Two Pairs", textTwoPairs);
		assertEquals("Two Pairs", text1);
	}
	
	@Test
	public void testTestPair() {
		// given
		lecture8.poker.Card[] cards1= {new lecture8.poker.Card(1, 6), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(2, 3), new lecture8.poker.Card(3, 9), new lecture8.poker.Card(4, 6)};
		// when
		String text1= lecture8.poker.Poker.testCards(cards1);
		// then
		assertEquals("One Pair.", text1);
	}
	
	@Test
	public void testTestHighCard() {
		// given
		lecture8.poker.Card[] cards1= {new lecture8.poker.Card(1, 6), new lecture8.poker.Card(1, 13), new lecture8.poker.Card(2, 3), new lecture8.poker.Card(3, 9), new Card(4, 5)};
		// when
		String text1= Poker.testCards(cards1);
		// then
		assertEquals("High Card: ", text1);
	}


}
