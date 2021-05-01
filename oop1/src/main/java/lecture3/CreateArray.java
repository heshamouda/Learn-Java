package lecture3;

public class CreateArray {
    public static void main(String[] args) {
        int[] numbers;
        int[][] matrix;
        String[] names;

        numbers = new int[5];
        matrix = new int[4][9];
        names = new String[10];

        //or
        int n = 7;
        numbers = new int[n];
        matrix = new int[n][n+5];
        names = new String[n];
    }
}
