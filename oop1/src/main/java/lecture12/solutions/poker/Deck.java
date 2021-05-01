package lecture12.solutions.poker;

public class Deck {
    private int counter;
    private Card[] cards;

    /* Create here
     * - the array with 52 places
     * - 52 cards for the poker game
     * and save them in the cards array*/
    public Deck() {
        counter = 0;
        cards = new Card[52];
        for (CardColor color : CardColor.values()) {
            for (CardValue value : CardValue.values()) {
                Card c = new Card(color, value);
                cards[counter] = c;
                counter++;
            }
        }
        counter = 0;
    }

    /*
    This method is just for testing and returns the card in the deck at position i
     */
    public Card getCard(int i) {
        return cards[i];
    }

    /* Here de deck should be shuffled*/
    public void shuffle() {
        for (int i = 0; i < 100; i++) {
            int number1 = (int) (Math.random() * 52);
            int number2 = (int) (Math.random() * 52);
            Card temp = cards[number1];
            cards[number1] = cards[number2];
            cards[number2] = temp;
        }
        counter = 0;
    }

    /* Here you should return the next card.
        The variable counter counts, at which card you are at.
        This counter should always point to the next card that should be returned.
     */
    public Card getNextCard() {
        return cards[counter++];
    }

}