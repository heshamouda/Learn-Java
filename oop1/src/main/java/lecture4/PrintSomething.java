package lecture4;

public class PrintSomething {
    public static void main(String[] args) {
        printSomething();
        System.out.println("-----------");
        printSomething(7);
        System.out.printf("-------------");
        int f = 6;
        printSomething(f);
    }

    // No parameter, no return value
    public static void printSomething(){
        System.out.println("What");
    }

    // One parameter, no return value
    public static void printSomething(int k){
        for(int i = 0; i<k; i++){
            System.out.println("What");
        }
    }
}
