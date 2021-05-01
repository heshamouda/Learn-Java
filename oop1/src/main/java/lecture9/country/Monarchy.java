package lecture9.country;

public class Monarchy extends Country {
    private String monarch;

    public Monarchy(String name, int inhabitants, String monarch) {
        super(name, inhabitants);
        this.monarch = monarch;
    }

    public Monarchy(int inhabitants, String monarch){
        super("Kingdom", inhabitants);
        this.monarch = monarch;
    }

    public Monarchy(){
        super("Kingdom", 0);
        this.monarch = "King";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("With the monarch " + monarch);
        //System.out.println("The monarchy " + getName() + " has " +
        //       getInhabitants() + " inhabitants and the monarch is named " + monarch + ".");
    }

    public String getMonarch() {
        return monarch;
    }

    public void setMonarch(String monarch) {
        this.monarch = monarch;
    }
}
