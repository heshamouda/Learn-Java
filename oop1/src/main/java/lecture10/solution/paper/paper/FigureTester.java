package lecture10.solution.paper.paper;

public class FigureTester {

    public static void main(String[] args) {
        // Task 1:
        //Figure f = new Figure();          // does not work because Figure is abstract
        Rectangle r = new Rectangle();      // okay
        Cyrcle c = new Cyrcle();            // okay
        Figure f = new Cyrcle();            // okay (Cyrcle is also a Figure)
        // Cyrcle c2 = new Rectangle();        // does not work (Rectangle is not also a Cyrcle)
    }
}
