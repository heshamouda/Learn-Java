package lecture2.solutions;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		// Ex 5.1
		int i=0;
		while (i<=50){
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		// Ex 5.2
		int j= 0;
		while (j <= 100) {
			System.out.println(j+"can be divided by 15 "+ j/15 + " times. "+j+"/15 = "+j/15.0);
			j++;
		}
		System.out.println();
		// Ex 5.3.a
		int k=0;
		while (k <= 20) {
			System.out.print(k*3 + " ");
			k++;
		}
		System.out.println();
		// Ex 5.3.b
		Scanner eingabe= new Scanner(System.in);
		System.out.println("How far do you want to print the series of 3 (3*n)?");
		int n= eingabe.nextInt();
		int l=0;
		while (l <= n) {
			System.out.print(l*3 + " ");
			l++;
		}
		System.out.println();
		// Aufgabe 5.4
		System.out.println("Start value");
		int x= eingabe.nextInt();
		System.out.println("End value");
		int y= eingabe.nextInt();
		System.out.println("Step");
		int z= eingabe.nextInt();
		int m=x;
		while (m <= y) {
			System.out.print(m + " ");
			m= m+z;
		}
	}

}
