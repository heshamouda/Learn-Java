package exam1.solutions;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        int deposits;
        int borrows;
        System.out.println("How many days should the library be open?");
        days = scanner.nextInt();
        int[] library = new int[days-1];

        System.out.println("How many books are deposited on the 1. day?");
        library[0] = scanner.nextInt();
        for(int i = 1; i< days-1;i++){
            do{
                System.out.println("How many books are borrowed on the " + (i+1) + ". day?");
                borrows = scanner.nextInt();
            }while(borrows>library[i-1]);
            System.out.println("How many books are deposited on the " + (i+1)+". day?");
            deposits = scanner.nextInt();
            library[i] = library[i-1] - borrows + deposits;
        }
        System.out.println("At the last day " + library[library.length-2] + " are being borrowed");
        double average;
        int sum = 0;
        for(int value : library){
            sum+=value;
        }
        average = (double)sum/ library.length;
        System.out.println("The average books in the library is: " + average);

        for(int i = 0; i<library.length; i++){
            System.out.print("From day " + (i+1) + " to " + (i+2) + ": ");
            if(library[i]<((2.0/3.0)*average)){
                System.out.print("*");
            }else if(library[i]>((4.0/3.0)*average)){
                System.out.print("***");
            }else{
                System.out.print("**");
            }
            System.out.print(" (" + library[i] + ")");
            System.out.println();
        }
    }
}
