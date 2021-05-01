package lecture9.solutions.realestate;

public class Property {
    private String owner;
    private int constructionYear;
    private double price;

    public Property(String owner, int constructionYear, double price) {
        this.owner = owner;
        this.constructionYear = constructionYear;
        this.price = price;
    }

    public void print() {
        System.out.println("The property of " + owner + " from year " + constructionYear + " is valued at " + price);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
