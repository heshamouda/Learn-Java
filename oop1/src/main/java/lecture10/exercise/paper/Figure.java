package lecture10.exercise.paper;

public abstract class Figure {
    private int x;
    private int y;

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void print(){
        System.out.println("Figure located at position " + x + "/" + y);
    }

    public abstract double getVolume();
    public abstract double getSurface();
}
