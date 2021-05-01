package lecture3;

import java.util.Scanner;

public class LoopInitialize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // "bad"
        int[] numbers = new int[5];
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        numbers[3] = scanner.nextInt();
        numbers[4] = scanner.nextInt();

        // better
        numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
    }
}
