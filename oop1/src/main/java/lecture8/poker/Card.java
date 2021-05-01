package lecture8.poker;

public class Card {
	/* Declare two attributes color (int)
	and value (int) */
	private int color;
	private int value;

	/* Create a parametrized constructor*/
	public Card(int c, int v){
		color = c;
		value = v;
	}


	/* Create the method getColorText which returns the color of a card as text (String)
	 * 1=Spade, 2=Heart, 3= Diamond, 4= Club
	 */
	public String getColorText() {
		return "";
	}
	
	/* Create the method getValueText which returns the value of a card as text (String)
	 * The numbers from 2-10 remain. 11= Jack, 12= Queen, 13= King, 14= Ace
	 */
	public String getValueText() {
		return "";
	}
	
	/* Create the method print which prints out information on the card.
	 * For this use the existing getColorText() and getValueText() methods
	 */
	public void print() {
		
	}
	
	/*Create the cetters for the two attributes*/
	public int getValue() {
		return value;
	}
	public int getColor() {
		return color;
	}

}
