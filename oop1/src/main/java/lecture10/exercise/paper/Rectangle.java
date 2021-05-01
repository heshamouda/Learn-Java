package lecture10.exercise.paper;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(int x, int y, double length, double width){
        super(x,y);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getVolume() {
        return getSurface() * 1.0;
    }

    @Override
    public double getSurface() {
        return this.length * this.width;
    }
}
