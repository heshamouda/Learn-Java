package lecture2;

import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n1, n2;
        int a1, a2, diff;

        System.out.println("Please provide the first name");
        n1 = s.next();
        System.out.println("Please provide the first age");
        a1 = s.nextInt();

        System.out.println("Please provide the second name");
        n2 = s.next();
        System.out.println("Please provide the second age");
        a2 = s.nextInt();

        diff = a1 - a2;
        if (diff < 0) {
            diff = -diff;
            System.out.println(n1 + " ist " + diff +
                    " Jahre jünger als " + n2);
        } else {
            System.out.println(n1 + " ist " + diff +
                    " Jahre älter als " + n2);
        }

    }
}
