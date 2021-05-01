package lecture1;

import java.util.Scanner;

/**
 * This is our test code for reading inputs
 */
public class Input {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Creating my new Scanner
        Scanner s = new Scanner(System.in);

        /*
        Reading all the variables.
        The user needs to write them from the console
         */
        System.out.println("What is your name?");
        String text = s.next();
        System.out.println("What is your age?");
        int age = s.nextInt();
        //double d = s.nextDouble();

        //System.out.println("You have entered: " + text + " - " + age + " - " + d);
        System.out.println("Wow " + text.charAt(0) + " you are " + age + " years old");
    }
}
