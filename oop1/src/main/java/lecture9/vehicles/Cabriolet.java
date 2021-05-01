package lecture9.vehicles;

public class Cabriolet extends Car{
    private boolean top;

    public Cabriolet(String name, int hp, int color){
        super(name, hp, color);
        this.top =false;
    }

    @Override
    public void print(){
        System.out.println("This is a cabriolet");
    }

}
