package lecture3;

public class StringArray {
    public static void main(String[] args) {
        String myString = "Text";
        for (int i = 0; i < myString.length(); i++) {
            System.out.print(myString.charAt(i));
        }
        char[] characters = myString.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
        }
    }
}
