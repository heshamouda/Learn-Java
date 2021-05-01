package lecture4.solutions.paper;

public class Exercise3 {
    public static void main(String[] args) {
        print(4);
        int number = 4;
        print(number);
        int x= 4;
        print(x);
        print(x);
    }

    public static void print(int x){
        while (x>0){
            System.out.print('?');
            x=x-1;
        }
        System.out.println();
    }

}
