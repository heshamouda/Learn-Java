package lecture1.solutions;

public class Binary {
   public static void main(String[] args){	
	int b= 10011101;
	int value;
	value = (b % 10) * 1;
	b= b / 10;

	System.out.println(value + "  / "+b);
	value = (b % 10) * 2;
	b= b / 10;
	System.out.println(value + "  / "+b);

	value = (b % 10) * 4;
	b= b / 10;
	System.out.println(value + "  / "+b);

	value = (b % 10) * 16;
	b= b / 10;
	System.out.println(value + "  / "+b);

	value = (b % 10) * 32;
	b= b / 10;
	System.out.println(value + "  / "+b);

	value = (b % 10) * 64;
	b= b / 10;
	System.out.println(value + "  / "+b);

	value = (b % 10) * 128;
	b= b / 10;
	System.out.println(value + "  / "+b);


   }
}
