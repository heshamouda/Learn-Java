package lecture1.solutions;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		String a, b, aHelp;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name!");
		a = scanner.next();
		System.out.println("Enter another name");
		b = scanner.next();

		System.out.println(a + " and " + b);

		aHelp = a;
		a = b;
		b = aHelp;

		System.out.println(a + " and " + b);

	}
}
