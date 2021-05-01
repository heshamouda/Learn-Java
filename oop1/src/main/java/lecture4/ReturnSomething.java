package lecture4;

public class ReturnSomething {
    public static void main(String[] args) {
        int i = returnSomething();
        System.out.println(returnSomething());
        System.out.println("------------");
        int j = returnSomething((float)5);
        System.out.println(returnSomething(j));
    }

    // return value, no parameter
    public static int returnSomething(){
        return 6;
    }

    // return value, single parameter
    public static int returnSomething(int k){
        System.out.println("I am an integer number!");
        return k+1;
    }

    public static int returnSomething(float k){
        System.out.println("I am a floating point number!");
        return (int)k + 1;
    }
}
