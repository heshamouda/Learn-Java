package lecture10.solution.musicians;

public abstract class Musician {

    private String name;
    private String genre;

    public Musician(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    public abstract int getFee();
    public abstract void print();

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }


}
