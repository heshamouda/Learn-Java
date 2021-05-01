package lecture10.solution.items;

public abstract class Furniture extends Item{
    private String material;
    private double length;
    private double width;

    public Furniture(double length, double width, String material, double price){
        super(price);
        this.material = material;
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public String getMaterial() {
        return material;
    }

    public abstract double getVolume();
}
