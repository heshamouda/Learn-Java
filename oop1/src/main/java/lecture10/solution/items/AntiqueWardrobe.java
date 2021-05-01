package lecture10.solution.items;

public class AntiqueWardrobe extends Wardrobe implements Antique{
    private String epoque;

    public AntiqueWardrobe(String epoque, double length, double width, double height, double price) {
        super(length, width, height, "Material", price);
        this.epoque = epoque;
    }

    @Override
    public String getEpoque() {
        return epoque;
    }
}
