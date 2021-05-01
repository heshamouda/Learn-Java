package lecture12.solutions.paper;

public class PlanetTester {
    public static void main(String[] args) {
        double myMass = 30.0;
        System.out.println("Your weight on "+ Planet.MARS + " is "+ Planet.MARS.surfaceWeight(myMass));
        Planet pluto = Planet.MARS;
        System.out.println("Your weight on "+ pluto +
                " is "+  pluto.surfaceWeight(myMass));
        System.out.println("---------------------------------");
        double earthWeight = 50.0;
        double mass = earthWeight/Planet.EARTH.surfaceGravity();

        Planet[] allPlanets = Planet.values();
        for (int i= 0; i< allPlanets.length; i++) {
            System.out.println("Your weight on "+allPlanets[i] +" is "+ allPlanets[i].surfaceWeight(mass));
        }
    }

}
