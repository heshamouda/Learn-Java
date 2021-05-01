package lecture2.solutions;

public class NestedLoops {

	public static void main(String[] args) {
		/*
		 * With the control character \t you can add a tabulator
		 * \n means that a line break should be made.
		 */
		
		for (int i = 1; i < 10; i++) {
			System.out.print("Number series for " + i + " : ");
			for (int j = 1; j <= 10; j++) {
				if ((j * i) < 10) {
					System.out.print(" ");
				}
				System.out.print((i * j));
				if (j < 10) {
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
	}

}
