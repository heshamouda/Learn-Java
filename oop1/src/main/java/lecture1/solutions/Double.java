package lecture1.solutions;

import java.util.Scanner;

public class Double {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number!");

		double zahl = scanner.nextDouble();
		zahl = zahl * 2;

		System.out.println("I double it to:");
		System.out.println(zahl);
	}
}
