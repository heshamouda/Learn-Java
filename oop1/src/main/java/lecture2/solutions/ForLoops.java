package lecture2.solutions;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		// Ex 5.1
		for (int i = 0; i <= 50; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// Ex 5.2
		for (int i = 0; i <= 100; i++) {
			System.out.println(i+"can be divided by 15 "+ i/15 + " times. "+i+"/15 = "+i/15.0);
		}
		System.out.println();
		// Ex 5.3.a
		for (int i = 1; i <= 20; i++) {
			System.out.print(i*3 + " ");
		}
		System.out.println();
		// Ex 5.3.b
		Scanner scanner= new Scanner(System.in);
		System.out.println("How far do you want to print the series of 3 (3*n)?");
		int n= scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i*3 + " ");
		}
		System.out.println();
		// Ex 5.4
		System.out.println("Start value");
		int x= scanner.nextInt();
		System.out.println("End value");
		int y= scanner.nextInt();
		System.out.println("Step");
		int k= scanner.nextInt();
		for (int i = x; i <= y; i= i+k) {
			System.out.print(i + " ");
		}
	}

}
