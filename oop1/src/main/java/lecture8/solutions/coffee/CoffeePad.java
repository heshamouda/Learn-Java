package lecture8.solutions.coffee;

public class CoffeePad {
    private int dl;
    private String type;

    public CoffeePad(int dl, String type){
        this.type = type;
        this.dl = dl;
    }

    public int getDl(){
        return dl;
    }
    public String getType(){
        return type;
    }
}
