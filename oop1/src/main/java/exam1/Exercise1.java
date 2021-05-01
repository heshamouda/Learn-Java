package exam1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numOfBooks;
        int numOfPages;
        double price;
        System.out.println("How many books would you like to print?");
        numOfBooks = scanner.nextDouble();
        System.out.println("How many pages will your books have?");
        numOfPages = scanner.nextInt();
        price = numOfPages * 1;
        System.out.println("You would like to print " + numOfBooks
                + " books with " + numOfPages + " pages each.");
        System.out.println("This will cost you " + price + " CHF");
        //System.out.println("Your price will be " + numOfPages + " * 1" + "=" + price + " CHF");
    }
}
