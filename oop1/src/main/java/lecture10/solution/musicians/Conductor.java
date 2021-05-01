package lecture10.solution.musicians;

public class Conductor extends Musician implements Expert {
    private int experience;

    public Conductor(String name, String genre, int experience) {
        super(name, genre);
        this.experience = experience;
    }

    @Override
    public String getTraining() {
        return getGenre() + "-Training";
    }

    @Override
    public int getWorkExperience() {
        return this.experience;
    }

    @Override
    public int getFee() {
        return 500 + (this.experience * 50);
    }

    @Override
    public void print() {
        System.out.println("The conductor " + getName() + " writes " + getGenre() + "-Music for" + this.experience + " years.");
    }
}
