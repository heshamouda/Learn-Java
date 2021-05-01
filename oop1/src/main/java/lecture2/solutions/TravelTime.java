package lecture2.solutions;

import java.util.Scanner;

public class TravelTime {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("How far do you travel?");
		double distance= scanner.nextDouble();
		System.out.println("How do you travel?");
		System.out.println("(0= Walking, 1= Bicycle, 2= Car, 3= Train)");
		int medium= scanner.nextInt();
		double time=0;
		if (medium==0){
			time = distance/5;
		} else if (medium ==1){
			time= distance/15;
		} else if (medium == 2){
			time= distance/50;
		} else {
			time= distance/70;
		}
		System.out.println("Your travel takes "+time+" h");
		System.out.println("Your travel takes "+Math.round(time*100)/100.0+" h");
	}

}
