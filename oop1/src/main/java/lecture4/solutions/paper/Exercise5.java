package lecture4.solutions.paper;

public class Exercise5 {
    public static void main(String[] args) {
        int x= 1;
        int y= 2;
        System.out.println(add(x,y));
        System.out.println(add(y,x));
    }

    public static int add(int x, int y){
        x = x+y;
        return x;
    }

}
