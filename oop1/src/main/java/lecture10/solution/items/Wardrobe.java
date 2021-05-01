package lecture10.solution.items;

public class Wardrobe extends Furniture {
    private double height;

    public Wardrobe(double length, double width, double height, String material, double price){
        super(length, width, material, price);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return this.height*getArea();
    }

    @Override
    public void getInfo() {
        System.out.println("This wardrobe is made of " + getMaterial() + " and costs " + getPrize());
    }
}
