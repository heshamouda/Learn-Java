package lecture2;

import java.util.Scanner;

public class Poker {
	public static void main(String[] args) {

		int color1, color2, color3, color4, color5, value1, value2, value3, value4, value5;

		System.out.println("P O K E R");
		System.out.println("*********");
		System.out.println("Information to the coding of card values:");
		System.out.println("VALUE");
		System.out.println("-----");
		System.out.println("2 bis 10: like the card value");
		System.out.println("11: Jack");
		System.out.println("12: Queen");
		System.out.println("13: King");
		System.out.println("14: Ace");
		System.out.println("COLORS");
		System.out.println("-----");
		System.out.println("1: Spades");
		System.out.println("2: Hearts");
		System.out.println("3: Clubs");
		System.out.println("4: Diamonds");

		System.out.println("INPUT OF YOUR CARDS");
		System.out.println("--------------------");
		System.out.println("Please enter your cards sorter (starting with the largest)!");

		Scanner scanner = new Scanner(System.in);
		System.out.print("1. Value: ");
		value1 = scanner.nextInt();
		System.out.print("1. Color: ");
		color1 = scanner.nextInt();

		System.out.print("2. Value: ");
		value2 = scanner.nextInt();
		System.out.print("2. Color: ");
		color2 = scanner.nextInt();

		System.out.print("3. Value: ");
		value3 = scanner.nextInt();
		System.out.print("3. Color: ");
		color3 = scanner.nextInt();

		System.out.print("4. Value: ");
		value4 = scanner.nextInt();
		System.out.print("4. Color: ");
		color4 = scanner.nextInt();

		System.out.print("5. Value: ");
		value5 = scanner.nextInt();
		System.out.print("5. Color: ");
		color5 = scanner.nextInt();

		System.out.println("You have entered:");
		System.out.println("*********************");
		System.out.println("Card 1: Value: " + value1 + " Color: " + color1);
		System.out.println("Card 2: Value: " + value2 + " Color: " + color2);
		System.out.println("Card 3: Value: " + value3 + " Color: " + color3);
		System.out.println("Card 4: Value: " + value4 + " Color: " + color4);
		System.out.println("Card 5: Value: " + value5 + " Color: " + color5);

		// Evaluation of the hand

	}

}
