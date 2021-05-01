package lecture5;

public class RecursiveSum {
    public static int recursiveSum(int i) {
        if (i == 1) { // Termination Criteria
            return 1; // Return a static value
        } else {
            int temp = recursiveSum(i - 1); // Recursive computation (call recursiveSum IN recursiveSum)
            return temp + i; // Return current value and value of previous step
        }
    }
}
