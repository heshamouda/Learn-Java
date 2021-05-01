package lecture12.solutions.poker;

public class Card {
	/* Declare two attributes color (int)
	and value (int) */
	private CardColor color;
	private CardValue value;

	/* Create a parametrized constructor*/
	public Card(CardColor c, CardValue v){
		color = c;
		value = v;
	}


	/* Create the method getColorText which returns the color of a card as text (String)
	 * 1=Spade, 2=Heart, 3= Diamond, 4= Club
	 */
	public String getColorText() {
		return color.toString();
	}
	
	/* Create the method getValueText which returns the value of a card as text (String)
	 * The numbers from 2-10 remain. 11= Jack, 12= Queen, 13= King, 14= Ace
	 */
	public String getValueText() {
		return value.toString();
	}
	
	/* Create the method print which prints out information on the card.
	 * For this use the existing getColorText() and getValueText() methods
	 */
	public void print() {
		System.out.println(getColorText()+"/"+getValueText());
	}
	
	/*Create the cetters for the two attributes*/
	public CardValue getValue() {
		return value;
	}
	public CardColor getColor() {
		return color;
	}

}
