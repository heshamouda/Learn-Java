package lecture4.solutions.programming;

public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("--------EX 1a---------");
		print();
		System.out.println("--------EX 1b---------");
		print(7);
		System.out.println("--------EX 1c---------");
		print(3,4);
	}

	/**
	 * Print 5 rows of 4 #
	 */
	public static void print(){
		for (int i=0; i<5; i++){
			for (int j=0; j<4; j++){
				System.out.print('#');
			}
			System.out.println();
		}
	}

	/**
	 * Print 5 rows of k #
	 * @param k The number of # to print per row
	 */
	public static void print(int k){
		for (int i=0; i<5; i++){
			for (int j=0; j<k; j++){
				System.out.print('#');
			}
			System.out.println();
		}
	}

	/**
	 * Print h rows of k #
	 * @param k The number of # to print per row
	 * @param h The number of rows
	 */
	public static void print(int k, int h){
		for (int i=0; i<h; i++){
			for (int j=0; j<k; j++){
				System.out.print('#');
			}
			System.out.println();
		}
	}

}
