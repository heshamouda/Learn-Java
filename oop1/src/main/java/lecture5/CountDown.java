package lecture5;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        countDown(scanner.nextInt());
    }
    public static void countDown(int n) {
        System.out.println(n);
        if (n > 0) {
            countDown(n - 1);
        }
    }
}
