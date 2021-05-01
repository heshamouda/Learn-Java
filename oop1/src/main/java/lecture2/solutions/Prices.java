package lecture2.solutions;

import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        double price;
        // for loop
        for (int day = 1; day <= 10; day++) {
            for (int persons = 1; persons <= 20; persons++) {
                if (persons >= 10) {
                    price = day * persons * 2.5 * 0.9;
                } else {
                    price = day * persons * 2.5;
                }
                System.out.print(price + " ");
            }
            System.out.println("");
        }

        System.out.println("-------------");
        int day = 1;
        double price2 = 0;
        while (day <= 10) {
            int persons = 1;
            while (persons <= 20) {
                if (persons >= 10) {
                    price2 = day * persons * 2.5 * 0.9;
                } else {
                    price2 = day * persons * 2.5;
                }
                System.out.print(price2 + " ");
                persons++;
            }
            System.out.println("");
            day++;
        }
    }
}
