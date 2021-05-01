package lecture9.solutions.realestate;

public class Residence extends Property {
    private int appartments;

    public Residence(String owner, int constructionYear, double price, int appartments) {
        super(owner, constructionYear, price);
        this.appartments = appartments;
    }

    @Override
    public void print() {
        System.out.println("The residence of " + getOwner() + " from year " + getConstructionYear() +
                " is valued at " + getPrice() + " and has " + appartments + " appartments.");

    }

    public int getAppartments() {
        return appartments;
    }

    public void setAppartments(int appartments) {
        this.appartments = appartments;
    }
}
