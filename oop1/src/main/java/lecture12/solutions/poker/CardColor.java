package lecture12.solutions.poker;

public enum CardColor {
    SPADE("Spade"), HEART("Heart"), DIAMOND("Diamond"), CLUB("Club");


    private String color;

    private CardColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
