package lecture4.solutions.programming;

public class Exercise2 {
    public static void main(String[] args) {
        int a = sum(4, 5);    // Ex 2a
        System.out.println(a);
        double bmi = getBMI(56, 1.63);   // Ex 2b
        System.out.println(bmi);
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = sum(values); // Ex 2c
        System.out.println(sum);
    }

    private static int sum(int[] values) {
        int res = 0;
        for (int i = 0; i < values.length; i++) {
            res = res + values[i];
        }
        return res;
    }

    private static double getBMI(int weight, double height) {
        return weight / (height * height);
    }

    private static int sum(int i, int j) {
        return i + j;
    }

}
