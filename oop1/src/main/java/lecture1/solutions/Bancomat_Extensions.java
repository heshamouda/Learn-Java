package lecture1.solutions;

import java.util.Scanner;

public class Bancomat_Extensions {
	public static void main(String[] args) {
		int amount;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money would you like to withdraw?");
		amount = scanner.nextInt();
		if (amount>3000){
			amount= 3000;
			System.out.println("We will withdraw the maximal amount of  "+amount);
		}
		if (amount%10 !=0){
			amount= amount-(amount%10);
			System.out.println("The amount will be rounded down to: "+amount);
		}
		System.out.println("Would you like to have mixed notes? (1 = ja, 0= nein)");
		int answer= scanner.nextInt();
		
		int hundreds=0, fifties=0, twenties=0, tens=0;
		if (answer==1){
			if (amount>200){
				fifties=2;
				amount= amount-100;
			}
			if (amount>100){
				twenties=5;
				amount= amount-100;
			}
		}
		hundreds = amount / 100;
		if (hundreds>0){
			System.out.println(hundreds + " 100er");
		}
		amount = amount % 100;
		fifties = fifties+ amount / 50;
		if (fifties>0){
		System.out.println(fifties + " 50er");
		}
		amount = amount % 50;
		twenties = twenties+ amount / 20;
		if (twenties>0){
		System.out.println(twenties + " 20er");
		}
		amount = amount % 20;
		tens = tens+amount / 10;
		if (tens>0){
		System.out.println(tens + " 10er");
		}
	}
}
