package lecture3;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {
        Integer[] numbers = {0,1,2,3,4,5,6,7,8,9};
        Integer[] newNumbers = Arrays.copyOf(numbers, 12);
        newNumbers[10] = 10;
        newNumbers[11] = 11;

        numbers[3] = 2;

        for(int i : numbers){
            System.out.println(i);
        }
        System.out.println("---------------");
        for(int i : newNumbers){
            System.out.println(i);
        }
    }
}
