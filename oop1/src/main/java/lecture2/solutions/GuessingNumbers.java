package lecture2.solutions;

import java.util.Scanner;

public class GuessingNumbers {
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.println("We look for a number between 1 and 100");
		// Pick random number between 1 and 100.
		int number= 1+(int)(Math.random()*100);
		int counter= 0;
		int guess=0;
		do {
			System.out.println("Please guess:");
			guess= scanner.nextInt();
			counter++;
			if (guess < number){
				System.out.println("Number too small");
			} else if (guess > number){
				System.out.println("Number too big");
			}
		} while (number!=guess);
		System.out.println("Guessed it! It took you "+counter+" guesses.");
	}
}
