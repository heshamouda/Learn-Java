package lecture3.solutions.programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CoupleSearch {
    public static void main(String[] args) {
        int[] values= {189,167,134,109,103,98,91,85,76,50,49,48,44,23} ;
        for (int i=0; i<values.length; i++){
            System.out.println(values[i] +" ");
        }

        // Variant 1
        System.out.println();
        for (int i=0; i<values.length-1; i++){ //IMPORTANT: run to length-1, because we access values[i+1]
            if (values[i] == values[i+1]+6){
                System.out.println("Found "+i +" and "+(i+1));
                break;
            }
        }
        System.out.println();
        // Variant 2
        for (int i=0; i<values.length-1; i++){
            for (int j=0; j<values.length-1;j++){
                if (values[i] == values[j]+6){
                    System.out.println("Found "+i+" and "+j);
                }
            }
        }

        // Supplement
        // Shuffle the array
        Random random = new Random();
        for(int i = 0; i<values.length;i++){
            int randomIndex = random.nextInt(values.length);
            int tempValue = values[randomIndex];
            values[randomIndex] = values[i];
            values[i] = tempValue;
        }
        System.out.println(Arrays.toString(values));
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }

    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1]) // Decide if ascending or descending order
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
