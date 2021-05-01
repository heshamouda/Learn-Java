package lecture7.solutions;

public class BoxFactory {
    public static void main(String[] args) {
        Box[] boxes = new Box[100];
        for (int i = 0; i < boxes.length; i++) {
            if (i < 10) {
                // 10 unit boxes
                boxes[i] = new Box();
            } else if (i < 90) {
                // 80 random boxes
                boxes[i] = new Box((int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1);
            } else {
                // 10 copy boxes
                boxes[i] = new Box(boxes[i - 10]);
            }
        }

        double totalVolume = 0.0;
        double totalSurface = 0.0;
        for (Box box : boxes) {
            totalVolume += box.getVolume();
            totalSurface += box.getSurface();
        }
        double totalTrucks = totalVolume / 40.0;
        System.out.println("We require " + totalTrucks + " trucks");
        System.out.println("Squaremeters: " + totalSurface);
        System.out.println("Weight: " + totalSurface*1000 + " grams");

    }
}
