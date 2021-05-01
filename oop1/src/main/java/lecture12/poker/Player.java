package lecture12.poker;

public class Player {
	Card[] cards;
	String name;

	/*
	* Save the name and create an array for 5 cards
	*/
	public Player(String n){
		this.name = n;
		cards = new Card[5];
	}

	/*
	* Save here the Card c at the next free position (just 1 time)
	*/
	public void addCard(Card c){
		for(int i =0; i<cards.length;i++){
			if(cards[i] == null){
				cards[i] = c;
				return;
			}
		}
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
		System.out.println(name + ":");
		for(int i = 0;i<cards.length;i++){
			System.out.print("Card " + (i+1) + ":");
			cards[i].print();
		}
		System.out.println(Poker.testCards(cards));
	}

}
