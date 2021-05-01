package lecture4.solutions.programming;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        int[] values = {7, 3, 5, 0, 9, 4, 1, 7, 2, 9, 1, 39};
        boolean found = false;
        found = search1(values);     // Ex 4a
        if (found) {
            System.out.println("1 was found");
        } else {
            System.out.println("1 was not found");
        }

        // Ex 4b
        Scanner s = new Scanner(System.in);
        System.out.println("Which number should be searched?");
        int x = s.nextInt();
        found = searchX(values, x);
        if (found) {
            System.out.println(x + " was found");
        } else {
            System.out.println(x + " was not found");
        }

        // Ex 4c
        System.out.println("Which number should be counted??");
        x = s.nextInt();
        int amount = countX(values, x);
        System.out.println(x + " was found " + amount + " times");
    }

    public static boolean search1(int[] values) {
        boolean found = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 1) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean searchX(int[] values, int x) {
        boolean found = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == x) {
                found = true;
            }
        }
        return found;
    }

    public static int countX(int[] values, int x) {
        int amount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == x) {
                amount++;
            }
        }
        return amount;
    }
}