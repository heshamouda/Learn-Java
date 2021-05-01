package lecture2;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean b;
        b= (3<7);
        System.out.println(b);  // b=true;

        b= (3<2) || (3<10);
        System.out.println(b);  // false || true -> b=true

        b= (3<2) && (3<10);
        System.out.println(b);  // false && true -> b=false

    }
}
