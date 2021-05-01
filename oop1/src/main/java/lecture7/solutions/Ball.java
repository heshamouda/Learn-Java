package lecture7.solutions;

public class Ball {
    public static double MY_PI = 3.1415;

    private double radius;

    public Ball() {
        this.radius = 1;
    }

    public Ball(double radius) {
        this.radius = radius;
    }

    public Ball(Ball b) {
        this.radius = b.radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * MY_PI * (radius * radius * radius);
    }

    public double getSurface(){
        return 4.0 * MY_PI * radius * radius;
    }

    public void printInfo() {
        System.out.println("This is a ball with radius: " + getRadius());
    }


}
