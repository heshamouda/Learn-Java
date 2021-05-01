package lecture10.solution.items;

public class AntiqueBook extends Book implements Antique {
    private String epoque;

    public AntiqueBook(String epoque, Author author, String title, String text, double price) {
        super(author, title, text, price);
        this.epoque = epoque;
    }

    @Override
    public double getPrize() {
        switch (epoque) {
            case "Romanesque":
            case "Gothic":
            case "Renaissance":
            case "Barock":
            case "Rokkoko":
                return super.getPrize() * 4;
            case "Classicism":
            case "Romance":
            case "Historicism":
            case "Realism":
                return super.getPrize() * 3;
            case "Impressionismus":
            case "Symbolism":
            case "Art Nouveau":
                return super.getPrize() * 2;
            default:
                return super.getPrize();
        }
    }

    @Override
    public String getEpoque() {
        return this.epoque;
    }
}
