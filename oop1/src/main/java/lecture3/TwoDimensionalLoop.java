package lecture3;

public class TwoDimensionalLoop {
    public static void main(String[] args) {
        int[][] matrix= new int[3][8];
        for (int i=0; i < matrix.length; i++){
            for (int j=0; j < matrix[i].length; j++){
                matrix[i][j]= 0;
            }
        }
    }
}
