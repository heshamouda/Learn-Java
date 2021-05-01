package lecture1.solutions;

import java.util.Scanner;

public class Bancomat {
	public static void main(String[] args) {
		int amount;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money would you like to withdraw?");
		amount = scanner.nextInt();
		int hundreds = amount / 100;
		System.out.println(hundreds + " 100er");
		amount = amount % 100;
		int fifties = amount / 50;
		System.out.println(fifties + " 50er");
		amount = amount % 50;
		int twenties = amount / 20;
		System.out.println(twenties + " 20er");
		amount = amount % 20;
		int tens = amount / 10;
		System.out.println(tens + " 10er");
	}
}
