package lecture8.poker;

public class Player {
	Card[] cards;
	String name;
	
	/*
	* Save the name and create an array for 5 cards
	*/
	public Player(String n){
		
	}
	
	/*
	* Save here the Card c at the next free position (just 1 time)
	*/
	public void addCard(Card c){

	}
	
	public Card getCard(int i) {
		return cards[i];
	}

	/* Print out information on a player:
	 * Peter :
	 * Card 1: Club/Jack
	 * ...
	 * High Card Jack
	 */
	public void print() {
		
		System.out.println(Poker.testCards(cards));
	}

}
