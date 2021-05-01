package lecture10.solution.post_office;

public class Parcel extends Item {
    private double width;
    private double height;
    private double depth;
    private double weight;
    private String content;


    public Parcel(Person sender, Person receiver, double width, double height, double depth, double weight, String content) {
        super(sender, receiver);
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Parcel " + "( " + getWidth() + "x" + getHeight() + "x" + getDepth() + ") - " + getWeight() + "Kg\n\r" +
                "From: " + getSender().toString() + "\n\r" +
                "To: " + getReceiver().toString() + "\n\r" +
                "Content: " + getContent();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public double getWeight() {
        return weight;
    }

    public String getContent() {
        return content;
    }
}
