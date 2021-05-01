package lecture8.poker;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PlayerTest {

	@Test
	public void testAddCard() {
		// given
		Player s = new Player("Peter");
		Card k1 = new Card(1, 4);
		Card k2 = new Card(2, 5);
		Card k3 = new Card(3, 6);
		Card k4 = new Card(4, 7);
		Card k5 = new Card(1, 8);
		// when
		s.addCard(k1);
		s.addCard(k2);
		s.addCard(k3);
		s.addCard(k4);
		s.addCard(k5);
		// then
		assertEquals(k1, s.getCard(0));
		assertEquals(k2, s.getCard(1));
		assertEquals(k3, s.getCard(2));
		assertEquals(k4, s.getCard(3));
		assertEquals(k5, s.getCard(4));
	}

	
}
