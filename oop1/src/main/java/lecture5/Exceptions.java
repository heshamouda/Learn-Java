package lecture5;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        // Uncomment only one line here per execution

        //stayAlive();

        //divideByZero();

        //nullPointer();

    }

    public static void nullPointer(){
        Scanner scanner = null;
        scanner.nextInt();
    }

    public static void divideByZero(){
        int x = 0;
        System.out.println(100/x);
    }

    public static void stayAlive(){
        System.out.println("Stay alive...");
        stayAlive();
    }
}
