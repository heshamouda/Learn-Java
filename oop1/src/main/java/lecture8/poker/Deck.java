package lecture8.poker;

public class Deck {
    private int counter;
    private Card[] cards;

    /* Create here
     * - the array with 52 places
     * - 52 cards for the poker game
     * and save them in the cards array*/
    public Deck() {

    }

    /*
    This method is just for testing and returns the card in the deck at position i
     */
    public Card getCard(int i) {
        return cards[i];
    }

    /* Here de deck should be shuffled*/
    public void shuffle() {

    }

    /* Here you should return the next card.
        The variable counter counts, at which card you are at.
        This counter should always point to the next card that should be returned.
     */
    public Card getNextCard() {

        return null;
    }

}
