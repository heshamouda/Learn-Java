package lecture10.solution.items;

public class AntiqueTable extends Wardrobe implements Antique{
    private String epoque;

    public AntiqueTable(String epoque, double length, double width, double height,  double price) {
        super(length, width, height, "Wood", price);
        this.epoque = epoque;
    }


    @Override
    public String getEpoque() {
        return this.epoque;
    }
}
