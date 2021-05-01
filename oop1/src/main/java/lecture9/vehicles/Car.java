package lecture9.vehicles;

public class Car extends Vehicle {
    private int hp;
    private int color;

    public Car(String name, int hp, int color){
        super(name, 0);
        this.hp = hp;
        this.color = color;
    }

    @Override
    public void print(){
        System.out.println("This is a car");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
