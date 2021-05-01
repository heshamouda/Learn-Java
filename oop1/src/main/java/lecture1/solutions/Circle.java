package lecture1.solutions;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		final double pi = 3.1415;
		double radius, circumference, area;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius!");
		radius = scanner.nextDouble();

		System.out.println("Radius: " + radius);

		circumference = 2 * radius * pi;
		area = radius * radius * pi;

		circumference = Math.round(circumference * 100) / 100.0;
		area = Math.round(area * 100) / 100.0;
		
		System.out.println("Der Circumference is: " + circumference);
		System.out.println("Die Area is: " + area);
		
	}

}
