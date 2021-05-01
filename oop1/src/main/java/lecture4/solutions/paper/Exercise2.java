package lecture4.solutions.paper;

public class Exercise2 {
    public static void main(String[] args) {
        print1();
    }
    public static void print1(){
        print2();
        System.out.println("1");
    }
    public static void print2(){
        print3();
        System.out.println("2");
    }
    public static void print3(){
        System.out.println("3");
    }
}
