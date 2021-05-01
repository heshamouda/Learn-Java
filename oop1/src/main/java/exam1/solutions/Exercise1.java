package exam1.solutions;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numOfBooks;
        int numOfPages;
        double price = 0;
        do {
            System.out.println("How many books would you like to print?");
            numOfBooks = scanner.nextDouble();
            if (numOfBooks > 0) {
                System.out.println("How many pages will your books have?");
                numOfPages = scanner.nextInt();
                if ((numOfBooks <= 3 && numOfPages >= 150) || numOfBooks >= 6) {
                    price += numOfPages * numOfBooks * 0.1 * 0.8;
                } else {
                    price += numOfPages * numOfBooks * 0.1;
                }
                System.out.println("You placed an order for " + numOfBooks
                        + " books with " + numOfPages + " pages each.");
            }
        } while (numOfBooks > 0);
        System.out.println("This will cost you " + price + " CHF");
        //System.out.println("Your price will be " + numOfPages + " * 1" + "=" + price + " CHF");
    }
}
