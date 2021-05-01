package lecture3;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] names = new String[21][2];
        names[0][0] = "Jane";
        names[0][1] = "Doe";

        System.out.println("Firstname: " + names[0][0] +
                " - Lastname: " + names[0][1]);
    }
}
