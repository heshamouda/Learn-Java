package lecture10.solution.items;

public class Table extends Furniture {

    public Table(double length, double width, String material, double price){
        super(length, width, material, price);
    }

    @Override
    public double getVolume() {
        return getArea()*74;
    }

    @Override
    public void getInfo() {
        System.out.println("This table is made of " + getMaterial() + " and costs " + getPrize());
    }
}
