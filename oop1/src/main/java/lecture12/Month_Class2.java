package lecture12;

public class Month_Class2 {
    public static final Month_Class2 JAN = new Month_Class2("January", 1);
    public static final Month_Class2 FEB = new Month_Class2("February", 2);
    public static final Month_Class2 MAR = new Month_Class2("March", 3);

    private String name;
    private int number;

    private Month_Class2(String n, int num){
        name = n;
        number = num;
    }
}
