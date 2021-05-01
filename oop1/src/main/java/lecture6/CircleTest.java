package lecture6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10.0;

        Circle c2 = new Circle();
        c2.radius = 15.0;

        System.out.println("Radius of c1: " + c1.radius);
        System.out.println("Radius of c2: " + c2.radius);

        System.out.println("PI of c1: " + c1.PI);
        System.out.println("PI of c2: " + c2.PI);
        System.out.println("PI of all circles: " + Circle.PI);
    }
}
