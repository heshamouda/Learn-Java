package lecture1.solutions;

public class Computations {
    public static void main(String[] args) {
        int intNumber_a, intNumber_b;
        double floatNumber_d;
        double floatingPointNumber_e, floatingPointNumber_f;
        // Initializing Variables
        intNumber_a = 12;
        intNumber_b = 5;
        floatingPointNumber_e = 12.0;
        floatingPointNumber_f = 5.0;

        System.out.println(intNumber_a + intNumber_b);
        System.out.println(floatingPointNumber_e + floatingPointNumber_f);
        System.out.println(intNumber_a - intNumber_b);
        System.out.println(floatingPointNumber_e - floatingPointNumber_f);
        System.out.println(intNumber_a * intNumber_b);
        System.out.println(floatingPointNumber_e * floatingPointNumber_f);
        System.out.println(intNumber_a / intNumber_b);
        System.out.println(floatingPointNumber_e / floatingPointNumber_f);
        System.out.println(intNumber_a % intNumber_b);
        System.out.println(floatingPointNumber_e % floatingPointNumber_f);

        System.out.println("------ EX6 ------");
        floatNumber_d= intNumber_a / intNumber_b;
        System.out.println(floatNumber_d);
        floatNumber_d= (double)intNumber_a / intNumber_b;
        System.out.println(floatNumber_d);
        floatNumber_d= (double)(intNumber_a / intNumber_b);
        System.out.println(floatNumber_d);


    }
}
