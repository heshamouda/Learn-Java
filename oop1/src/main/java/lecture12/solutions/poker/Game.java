package lecture12.solutions.poker;

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
		players = new Player[amount];
		for(int i = 0; i<amount;i++){
			players[i] = new Player("Player " + (i+1));
		}
		game = new Deck();
		game.shuffle();
	}
	
	/* 
	 * Each player should be dealt five cards
	 */
	public void distribute(){
		for(int i = 0;i< players.length;i++){
			for(int j=0;j<5;j++){
				players[i].addCard(game.getNextCard());
			}
		}
	}
	
	/*
	* For all players you should print what kind of hand they have
	 */
	public void evaluate(){
		for(int i = 0; i<players.length;i++){
			players[i].print();
		}
	}
	
	public static void main(String[] args) {
		Game game= new Game(6);
		game.distribute();
		game.evaluate();
	}
}
