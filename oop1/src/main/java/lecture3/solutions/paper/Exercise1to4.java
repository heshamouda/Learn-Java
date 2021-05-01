package lecture3.solutions.paper;

import java.util.Arrays;

public class Exercise1to4 {
    public static void main(String[] args) {
        // Exercise 1
        int[] values1 = new int[8];
        for (int i = 0; i < 8; i++) {
            values1[i] = i + 2;
        }
        System.out.println(Arrays.toString(values1));

        // Exercise 2
        int[] values2 = new int[10];
        for (int i = 9; i >= 0; i--) {
            values2[i] = i;
        }
        System.out.println(Arrays.toString(values2));

        // Exercise 3
        int[] values3 = {7, 3, 5, 1, 9, 4, 1};
        for (int i = 0; i < 7; i++) {
            values3[i] = values3[i] * 2;
        }
        System.out.println(Arrays.toString(values3));

        //Exercise 4
        int[] values4 = {1, 2, 3, 4, 5, 6, 7};
        int[] values5 = new int[3];
        for (int i = values4[1]; i < values4[4]; i++) {
            values5[i - 2] = values4[i];
        }
        System.out.println(Arrays.toString(values5));
    }
}
