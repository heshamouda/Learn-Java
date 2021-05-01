package lecture10.solution.musicians;

public class MusicianTesting {
    public static void main(String[] args) {
        Conductor c = new Conductor("Mozart", "Classic", 20);
        c.print();
        System.out.println(c.getFee());
        System.out.println(c.getTraining());
    }
}
