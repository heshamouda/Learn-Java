package lecture4.solutions.programming;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(sumR(5));
        System.out.println(factorialR(5));
        System.out.println(mod5(20));
        System.out.println(modk(20, 3));

    }

    public static int sumR(int value) {
        if(value == 0){
            return 0;
        } else if (value==1){
            return 1;
        } else {
            return value+sumR(value-1);
        }
    }
    public static int factorialR(int value) {
        if (value==1){
            return 1;
        } else {
            return value*factorialR(value-1);
        }
    }
    public static int mod5(int value) {
        if (value<5){
            return 0;
        } else {
            return 1+mod5(value-5);

        }
    }

    public static int modk(int value, int k) {
        if (value<k){
            return 0;
        } else {
            return 1+modk(value-k, k);
        }
    }
}
