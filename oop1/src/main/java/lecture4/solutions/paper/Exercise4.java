package lecture4.solutions.paper;

public class Exercise4 {
    public static void main(String[] args) {
        int number1 = add(1,2);
        System.out.println(number1);
        int number2 = subtract(4,2);
        System.out.println(number2);
        number1 = add(number1,2);
        System.out.println(number1);
        number2 = add(subtract(4,3),add(1,1));
        System.out.println(number2);
    }

    public static int add(int x, int y){
        int sum= x+y;
        return sum;
    }

    public static int subtract(int x, int y){
        int difference = x-y;
        return difference;
    }

}
