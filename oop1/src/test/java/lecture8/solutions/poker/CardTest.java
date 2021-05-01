package lecture8.solutions.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

	@Test
	public void testGetColour() {
		// given
		Card c1= new Card(1,2);
		Card c2= new Card(2,3);
		Card c3= new Card(3,12);
		Card c4= new Card(4,10);
		// when
		int color1= c1.getColor();
		int color2= c2.getColor();
		int color3= c3.getColor();
		int color4= c4.getColor();
		// then
		assertEquals(1, color1);
		assertEquals(2, color2);
		assertEquals(3, color3);
		assertEquals(4, color4);
	}

	@Test
	public void testGetColorText() {
		// given
		Card c1= new Card(1,2);
		Card c2= new Card(2,3);
		Card c3= new Card(3,12);
		Card c4= new Card(4,10);
		// when
		String color1= c1.getColorText();
		String color2= c2.getColorText();
		String color3= c3.getColorText();
		String color4= c4.getColorText();
		// then
		assertEquals("Spade", color1);
		assertEquals("Heart", color2);
		assertEquals("Diamond", color3);
		assertEquals("Club", color4);
	}
	
	@Test
	public void testGetValue() {
		// given
		Card c1= new Card(1,2);
		Card c2= new Card(2,3);
		Card c3= new Card(3,12);
		Card c4= new Card(4,10);
		// when
		int value1= c1.getValue();
		int value2= c2.getValue();
		int value3= c3.getValue();
		int value4= c4.getValue();
		// then
		assertEquals(2, value1);
		assertEquals(3, value2);
		assertEquals(12, value3);
		assertEquals(10, value4);
	}
	
	@Test
	public void testGetValueText() {
		// given
		Card c1= new Card(1,2);
		Card c2= new Card(2,10);
		Card c3= new Card(2,11);
		Card c4= new Card(3,12);
		Card c5= new Card(4,13);
		Card c6= new Card(2,14);
		// when
		String value1= c1.getValueText();
		String value2= c2.getValueText();
		String value3= c3.getValueText();
		String value4= c4.getValueText();
		String value5= c5.getValueText();
		String value6= c6.getValueText();
		// then
		// 11= Jack, 12= Queen, 13= King, 14= Ace
		assertEquals("2", value1);
		assertEquals("10", value2);
		assertEquals("Jack", value3);
		assertEquals("Queen", value4);
		assertEquals("King", value5);
		assertEquals("Ace", value6);
	}

}
