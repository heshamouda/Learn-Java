package lecture1.solutions;

public class DummyCrypto {
   public static void main(String[] args){
	int key= 5;
	char letter = 'A';
	System.out.println("You have entered "+letter+" and "+key+".");
	int ascii= (int) letter;
	ascii= ascii + key;
	letter= (char) ascii;
	System.out.println("Encrypted: "+letter);
   }
}
