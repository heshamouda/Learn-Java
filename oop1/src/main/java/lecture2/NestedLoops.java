package lecture2;

public class NestedLoops {
    public static void main(String[] args) {

        // Nested for loops
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + j);
            }
        }
        System.out.println("-----------------------------");
        // Nested while loops
        int number1, number2;
        number1 = 0;
        while (number1 < 5) {
            number2 = 0;
            while (number2 < 20) {
                System.out.println(number1 + number2);
                number2++;
            }
            number1++;
        }
    }
}
