package lecture4;

public class Test {

    public static void main(String[] args) {
        System.out.println(test(4,5));
        System.out.println(test(5,5));
    }

    public static boolean test(int x, int y){
        if (x==y){
            return true;
        } else {
            return false;
        }
    }

}
