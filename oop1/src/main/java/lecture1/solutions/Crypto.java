package lecture1.solutions;

public class Crypto {
   public static void main(String[] args){
	int key= Integer.parseInt(args[1]);
	char character = args[0].charAt(0);
	System.out.println("You have entered "+character+" and "+key+".");
	int ascii= (int) character;
	ascii= ascii + key;
	character= (char) ascii;
	System.out.println("Encrypted: "+character);
   }
}
