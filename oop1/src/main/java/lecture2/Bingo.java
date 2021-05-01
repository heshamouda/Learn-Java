package lecture2;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        String text = "Let's play Bingo?";
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is my favourite game! But what is the word you say when winning?");
        text = scanner.next(); // „Bingo“
        while (text.equals("Bingo")) { //Do not use == for Strings but .equals()
            System.out.println("This is my favourite game! But what is the word you say when winning?");
            text = scanner.next();
        }
    }
}
