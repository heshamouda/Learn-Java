package lecture2.solutions;

import java.util.Scanner;

public class GradePointAverage {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		double sum=0;
		int count=0;
		double grade=0;
		System.out.println("Enter your grades");
		do {
			System.out.println((count+1)+".Note: ");
			grade= scanner.nextDouble();
			if (grade>0){
				count++;
				sum= sum+grade;
			}
		} while (grade>0);
		System.out.println("You have entered "+count+" grades. Average: "+(sum/count));
	}

}
