package lecture4;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(40));
    }

    public static int fibonacci(int x){
        if(x == 1){
            return 1;
        }else if(x==0){
            return 0;
        }else {
            return (fibonacci(x - 1) + fibonacci(x - 2));
        }
    }
}
