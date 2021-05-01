package lecture12.poker;

public enum CardColor {
    SPADE("Spade"), HEART("Heart"), DIAMOND("Diamond"), CLUB("Club");

    private final String text;

    private CardColor(String text) {
        // ALL ENUM CONSTRUCTORS MUST BE PRIVATE!
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
