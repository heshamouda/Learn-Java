package lecture10.solution.paper.paper;

public abstract class Figure {
    private int x;
    private int y;

    public Figure(){
        this.x = 0;
        this.y = 0;
    }

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void print(){
        System.out.println("Figure at " + x + "/" + y);
    }

    public abstract double getSurface();
    public abstract double getVolume();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
