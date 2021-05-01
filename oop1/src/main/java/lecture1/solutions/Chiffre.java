package lecture1.solutions;

import java.util.Scanner;

public class Chiffre {
    /**
     * Caesar-Encryption for any letter
     */
    public static void main(String[] args) {
        // Main-Methode
        char letter; // Variable for a letter
        int chiff_key; // Variable for the key
        int letter_ascii;
        int letter_ascii_encr;
        char letter_encr;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the next letter!");
        String wert1 = scanner.next();
        letter = wert1.charAt(0);

        System.out.println("Enter the key!");
        chiff_key = scanner.nextInt();

        System.out.println("You entered " + letter + " and "
                + chiff_key);

        letter_ascii = (int) letter;
        letter_ascii_encr = letter_ascii + chiff_key;
        letter_encr = (char) letter_ascii_encr;

        System.out.println("The encrypted letter is: "
                + letter_encr);

    }

}
