package lecture8.poker;

public class Game {

	Player[] players;
	Deck game;
	
	/* 
	 * When a game starts you should:
	 * - Create the array for all players
	 * - initialize the array with the amount of players
	 * - Create a deck
	 * - mix the deck
	 */
	public Game(int amount){
		
	}
	
	/* 
	 * Each player should be dealt five cards
	 */
	public void distribute(){

	}
	
	/*
	* For all players you should print what kind of hand they have
	 */
	public void evaluate(){
		
	}
	
	public static void main(String[] args) {
		Game game= new Game(6);
		game.distribute();
		game.evaluate();
	}
}
