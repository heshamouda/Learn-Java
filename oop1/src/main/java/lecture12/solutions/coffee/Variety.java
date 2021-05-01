package lecture12.solutions.coffee;

public enum Variety {
    ESPRESSO(7, 8), RISTRETTO(9, 9), MACCHIATO(5, 6), DOPPIO(8, 3);

    private int strength;
    private int roasting;

    private Variety(int strength, int roasting) {
        this.strength = strength;
        this.roasting = roasting;
    }

    public int getRoasting() {
        return roasting;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return this.name() + " with strenght: " + getStrength() + " and roasting " + getRoasting();
    }
}
