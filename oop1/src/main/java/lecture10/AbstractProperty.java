package lecture10;

public abstract class AbstractProperty {
    private String owner;
    private int yearOfConstruction;
    private double price;

    public AbstractProperty(String o, int y, double p){
        owner = o;
        yearOfConstruction = y;
        price = p;
    }

    public abstract void print();
}
