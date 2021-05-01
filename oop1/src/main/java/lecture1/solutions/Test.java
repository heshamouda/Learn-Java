package lecture1.solutions;

public class Test {
   public static void main(String[] args){	
	int a = 2;
	int b = 4;
	a *= 5;
	a += 4;
	b = a++;	
	a = ++b;
	System.out.println(a);
	System.out.println(b);
   }
}
