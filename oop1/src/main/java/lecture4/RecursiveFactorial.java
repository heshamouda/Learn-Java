package lecture4;

public class RecursiveFactorial {

    public static void main(String[] args) {
        System.out.println("5! is: " + factorial(5));
    }

    public static int factorial(int i){
        if(i == 0 || i == 1){
            return 1;
        }else{
            return i*factorial(i-1);
        }
    }
}
