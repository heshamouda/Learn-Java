package lecture4;

public class ReturnPlacement {
    public static void main(String[] args) {
        int i = compute(5);
        System.out.println(i);
    }

    public static int compute(int k){
        int result = 0;
        for(int i = 0; i<k;i++){
            result = result+i;
            // return result;
        }
        return result;
    }
}
