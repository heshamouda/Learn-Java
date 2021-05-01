package lecture3;

public class ArrayForEach {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        // fill the array
        for(int i = 0; i<numbers.length;i++){
            numbers[i] = i+1;
        }

        // read the array
        for(int j = 0; j<numbers.length;j++){
            System.out.println(numbers[j]);
        }
        System.out.println("-----------------");
        // read the array using for-each
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
