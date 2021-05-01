package lecture2;

public class BasicSwitchStatement {
    public static void main(String[] args) {
        // Basic Example
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
        }

        // Basic Example with default
        int b = 1;
        switch (b) {
            case 1:
                System.out.print("1 ");
                break;
            case 2:
                System.out.print("2 ");
                break;
            default:
                System.out.println("Ende");
        }

        int c = 2;
        switch (c) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Odd Number");
                break;
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
                System.out.println("Even Number");
        }
        int month = 1;
        int day = 20;
        if (((month == 3) && (day > 20)) || (month == 4) || (month == 5) || ((month == 6) && (day < 21))) {
            System.out.println("Spring");
        }
    }
}
