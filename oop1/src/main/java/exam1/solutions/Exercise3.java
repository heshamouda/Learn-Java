package exam1.solutions;

public class Exercise3 {

    public static void main(String[] args) {
        int[] values = {5,2,9,10,34,2,7};
        double average = averages(values);
        int[] values2 = {1,2,3,4,5,6,7,8};
        double average2 = averages(values2);


        System.out.println(average);
        System.out.println(average2);
    }

    public static double averages(int[] values){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        double result = 0.0;
        for(int x: values) {
            if (x < smallest) {
                smallest = x;
            }
            if (x > largest) {
                largest = x;
            }
        }
        System.out.println("largest: " + largest);
        System.out.println("smallest: " + smallest);
        return (double)(smallest+largest)/2.0;
    }
}
