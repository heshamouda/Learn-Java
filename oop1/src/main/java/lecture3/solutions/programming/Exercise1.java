package lecture3.solutions.programming;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] values = {7, 3, 5, 0, 9, 4, 1, 7, 2, 9, 1, 39};
        boolean found = false;

        // Exercise 1.a
        // Search for the 1
        for(int i : values){
            if(i == 1){
                found=true;
                break; // We can use break to immediately stop the execution of a for/while loop.
            }
        }
        // Inform the user that the number has been found
        if(found){ //# if(found) is the same as if(found == true)
            System.out.println("1 has been found");
        }else{
            System.out.printf("1 has not been found");
        }

        // Exercise 1.b / 1.c
        found = false; // reset the found value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to search for: ");
        int foundAmount = 0;
        int searchNumber = scanner.nextInt();
        for(int i : values){
            if(i == searchNumber){
                found = true;
                foundAmount++;
                // We can not terminate the for loop with break here, because we want to search every position
            }
        }
        if(found){
            System.out.println("The number: " + searchNumber + " has been found " + foundAmount + " times");
        }else{
            System.out.println("The number: " + searchNumber + " has not been found");
        }


    }
}
