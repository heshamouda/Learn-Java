package lecture12.poker;

public enum CardValue {
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(11, "Jack"),
    QUEEN(12, "Queen"),
    KING(13, "King"),
    ACE(14, "Ace");

    private final int value;
    private final String text;

    private CardValue(int value, String text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }

    public int getValue() {
        return value;
    }
}
