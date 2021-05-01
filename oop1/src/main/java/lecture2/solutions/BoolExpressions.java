package lecture2.solutions;

public class BoolExpressions {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println((3<7) && (3 <8));
        System.out.println((3<7) || (3 >8));
        System.out.println(((1==0) || (2==3)) && (1>0));
        System.out.println((7%3 >0 ) && (7%3 !=0));

        System.out.println("------------------------");
        // Exercise 2
        int a = 1; int b=5;
        System.out.println((a > b));
        System.out.println((a+3 >= b));
        System.out.println((a<7) && (b>7));
        System.out.println((a==3) || (++a <b));
        System.out.println((a<=128) && (a>-128));

        System.out.println((a+1>5) && (a<5));

    }

}
