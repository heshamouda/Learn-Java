package lecture4;

public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println(recursiveSum(3));
    }

    public static int recursiveSum(int i){
        if(i == 1){ // Termination Criteria
            return 1; // Return a static value
        } else{
            int temp = recursiveSum(i-1); // Recursive computation (call recursiveSum IN recursiveSum)
            return temp + i; // Return current value and value of previous step
        }
    }
}
