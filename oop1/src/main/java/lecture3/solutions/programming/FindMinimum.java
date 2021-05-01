package lecture3.solutions.programming;

public class FindMinimum {
    public static void main(String[] args) {
        int[] values= {7,3,5,0,9,4,1,7,2,9,1,39} ;

        // Create two variables to store minimal value and position
        int minValue = Integer.MAX_VALUE; //Initialize the minimal value with the MAXIMAL integer value possible
        int minPosition = -1;
        // Loop over all entries
        for(int i = 0; i<values.length;i++){
            if(values[i] < minValue){ // Check if the array value is smaller than the current minimal value
                minValue = values[i]; // save this value as the new minimal value
                minPosition = i; // save the position
            }
        }
        // search for the minimal value
        System.out.println("The minimal value is: " + minValue + " at array postition " + minPosition);

    }
}
