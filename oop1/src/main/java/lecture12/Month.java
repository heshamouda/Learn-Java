package lecture12;

public enum Month {
    JAN("January", 1),
    FEB("February", 2),
    MAR("March", 3);

    private String name;
    private int number;

    private Month(String n, int num) {
        name = n;
        number = num;
    }
}
