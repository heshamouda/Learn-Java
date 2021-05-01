package lecture12.solutions.paper;

public enum Planet {
    // Enumeration elements of the planets
    MERCURY(2439700, Double.parseDouble("3.303E+23")),
    VENUS(6051800, Double.parseDouble("4.869E+24")),
    EARTH(6478140, Double.parseDouble("5.976E+24")),
    MARS(3397200, Double.parseDouble("6.421E+23")),
    JUPITER(71492000, Double.parseDouble("1.9E+27")),
    SATURN(60268000, Double.parseDouble("5.688E+26")),
    URANUS(25559000, Double.parseDouble("8.686E+25")),
    NEPTUN(24746000, Double.parseDouble("1.024E+26"));


    // universal gravitational constant (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;
    // Attributes
    private final double radius;
    private final double mass;

    // Constructor and getter for the Attributes
    private Planet(double radius, double mass) {
        this.radius = radius;
        this.mass = mass;
    }


    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
} 
