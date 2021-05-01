package lecture4.solutions.programming;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(pointCalculator(2, 4, '/'));  // 0.5
        System.out.println(pointCalculator(2, 0, '/'));  // 0
        System.out.println(pointCalculator(2, 3, '*'));  // 6
        System.out.println(pointCalculator(2, 3, '+'));  // 0

    }

    public static double pointCalculator(int x, int y, char sign) {
        double result = 0.0;
        switch (sign) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = y - x;
                break;
            case '/':
                if (x == 0) {
                    result = 0;
                } else {
                    result = y / x;
                }
                break;
            case '*':
                result = x * y;
                break;
        }

        return result;
    }
}
