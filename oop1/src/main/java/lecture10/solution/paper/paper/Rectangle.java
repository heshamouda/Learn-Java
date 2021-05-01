package lecture10.solution.paper.paper;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(){
        super();
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(int x, int y, double width, double length){
        super(x,y);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getSurface() {
        return this.length * this.width;
    }

    @Override
    public double getVolume() {
        return this.length * this.width * 1.0;
    }
}
