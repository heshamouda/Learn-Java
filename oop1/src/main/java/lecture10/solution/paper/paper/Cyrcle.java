package lecture10.solution.paper.paper;

public class Cyrcle extends Figure {
    private double radius;

    public Cyrcle(){
        super();
        this.radius = 0.0;
    }

    public Cyrcle(int x, int y, double radius){
        super(x,y);
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getVolume() {
        return getSurface()*1.0;
    }
}
