package lecture2.solutions;

import java.util.Scanner;

public class SeasonsSwitch {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int day;
		int month;
		System.out.println("Please enter a day:");
		day= s.nextInt();
		System.out.println("Please enter a month (from 1 to 12):");
		month= s.nextInt();
		if ((month>0)&&(month<13)){
			switch (month){
			case 1: case 2:
				System.out.println("Winter");
				break;
			case 3:
				if (day<21){
					System.out.println("Winter");
				} else {
					System.out.println("Spring");
				}
				break;
			case 4: case 5:
				System.out.println("Spring");
				break;
			case 6:
				if (day<21){
					System.out.println("Spring");
				} else {
					System.out.println("Summer");
				}
				break;
			case 7: case 8:
				System.out.println("Summer");
				break;
			case 9:
				if (day<23){
					System.out.println("Summer");
				} else {
					System.out.println("Autumn");
				}
				break;
			case 10: case 11:
				System.out.println("Autumn");
				break;
			case 12:
				if (day<21){
					System.out.println("Autumn");
				} else {
					System.out.println("Winter");
				}
				break;
			}
		} else {
			System.out.println("No possible month");
		}

		
	}

}
