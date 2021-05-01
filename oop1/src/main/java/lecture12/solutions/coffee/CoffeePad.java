package lecture12.solutions.coffee;

public class CoffeePad {
    private int dl;
    private Variety type;

    public CoffeePad(int dl, Variety type){
        this.type = type;
        this.dl = dl;
    }

    public int getDl(){
        return dl;
    }
    public Variety getType(){
        return type;
    }
}
