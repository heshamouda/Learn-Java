package lecture7.solutions;

import java.util.Objects;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box() {
        this(1, 1, 1);
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(Box b) {
        this.depth = b.depth;
        this.height = b.height;
        this.width = b.width;
    }

    public boolean equals(Box b) {
        if (this == b) return true;
        if (b == null) return false;
        return Double.compare(b.width, this.width) == 0 &&
                Double.compare(b.height, this.height) == 0 &&
                Double.compare(b.depth, this.depth) == 0;
    }

    public double getVolume() {
        return this.width * this.height * this.depth;
    }

    public double getSurface() {
        return (2 * width * height) + (2 * width * depth) + (2 * height * depth);
    }
}
