package lecture12;

public class MonthUsage {
    public static final Month_Class1 JAN = new Month_Class1("January", 1);
    public static final Month_Class1 FEB = new Month_Class1("February", 2);
    public static final Month_Class1 MAR = new Month_Class1("March", 3);

    public static void main(String[] args) {
        // Using a simple class
        Month_Class1 m1 = JAN;

        // Using a class with final members
        Month_Class2 m2 = Month_Class2.JAN;

        // Using an enumeration
        Month m3 = Month.JAN;

        // Internal call to toString()
        System.out.println(m3);

        // Name of the enum
        System.out.println(m3.name());

        // position / ordinal number of the enum
        System.out.println(m3.ordinal());
    }
}
