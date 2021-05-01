package lecture9.vehicles;

public class Bicycle extends Vehicle {
    private int frame;

    public Bicycle(String name, int frame){
        super(name, 0);
        this.frame = frame;
    }

    @Override
    public void print(){
        System.out.println("This is a bicycle");
    }

    public int getFrame() {
        return frame;
    }

    public void setFrame(int frame) {
        this.frame = frame;
    }
}
