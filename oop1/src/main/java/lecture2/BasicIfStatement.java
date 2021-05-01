package lecture2;

public class BasicIfStatement {

    public static void main(String[] args) {

        // Basic If
        int a = 3;

        if (a > 100) {      // Condition
            a = a / 100;
        }

        //Basic If-Else
        if (a > 3) {
            System.out.println("a is greater than 3");
        } else {
            System.out.println("a is not greater than 3");
        }

        //Basic If-Else If
        if (a > 3) {
            System.out.println("a is greater than 3");
        } else if (a == 3) {
            System.out.println("a is equals to 3");
        }

        //Basic if - else if - else
        if (a > 3) {
            System.out.println("a is greater than 3");
        } else if (a == 3) {
            System.out.println("a is equals to 3");
        } else {
            System.out.println("a is less than 3");
        }


    }
}
