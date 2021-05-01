package lecture3.solutions.paper;

public class Exercise5 {

    public static void main(String[] args) {
        double price;
        double[][] prices = new double[10][20];
        for (int day = 1; day <= 10; day++) {
            for (int persons = 1; persons <= 20; persons++) {
                price = persons * day * 2.5;
                if (persons > 10) {
                    price = price * 0.9;
                }
                prices[day-1][persons-1] = price;
                System.out.print(price + "|");
            }
            System.out.println();
        }

    }

}
