package lecture3;

public class ArrayLoops {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        for (int i = 0; i < 7; i++) {
            numbers[i] = i + 2;
        }

        // equivalent
        for (int i = 2; i < 9; i++) {
            numbers[i - 2] = i;
        }
    }
}
