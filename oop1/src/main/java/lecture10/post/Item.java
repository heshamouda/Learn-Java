package lecture10.post;

public abstract class Item {
    private double weight;

    public Item(double w){
        this.weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double getPrize();
}
