package exam1;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        int deposits;
        int borrows;

        // Read in the number of open days (1Pt)
        System.out.println("How many days should the library be open?");
        days = scanner.nextInt();

        // Create an array for storing the books in the library between two days (1 Pt)
        int[] library = new int[days];
        /**
         * Now save the assignment of the library. Note that on the first day books are only deoned, and on the last day all books are borrowed.
         * Additionally, only as many books can be borrowed as are in the library.
         */
        System.out.println("How many books are in stock initially?");
        library[0] = scanner.nextInt();
        for(int i = 1; i< days;i++){
            do{
                System.out.println("How many books are borrowed on the " + i + ". day?");
                borrows = scanner.nextInt();
            }while(borrows>library[i-1]);
            System.out.println("How many books are deposited on the " + i +". day?");
            deposits = scanner.nextInt();
            library[i] = library[i-1] - borrows + deposits;
        }
        System.out.println("At the last day " + library[library.length-1] + " books are being borrowed");

        // calculate and output the average occupancy
        double average;
        double sum = 0;
        for(int value : library){
            sum+=value;
        }
        average = (double)sum/ library.length;
        System.out.println("The average books in the library is: " + average);

        for(int i = 0; i<library.length; i++){
            System.out.print("From day " + (i+1) + " to " + (i+2) + ": ");
            if(library[i]<((2.0/5.0)*average)){
                System.out.print("*");
            }else if(library[i]>((7.0/5.0)*average)){
                System.out.print("***");
            }else{
                System.out.print("**");
            }
            System.out.print(" (" + library[i] + ")");
            System.out.println();
        }
    }
}
