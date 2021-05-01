package lecture2.solutions;

import java.util.Scanner;

public class TravelTimeSwitch {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("How far do you travel?");
		double distance= scanner.nextDouble();
		System.out.println("How do you travel?");
		System.out.println("(0= Walking, 1= Bicycle, 2= Car, 3= Train)");
		int medium= scanner.nextInt();
		double time=0;
		switch(medium){
			case 0: 
				time = distance/5;
				break;
			case 1:
				time= distance/15;
				break;
			case 2:
				time= distance/50;
				break;
			default:
				time= distance/70;
		}
		System.out.println("Your travel takes "+time+" h");
		System.out.println("Your travel takes "+Math.round(time*100)/100.0+" h");
	}

}
