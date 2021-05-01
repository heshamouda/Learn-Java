package lecture5;

public class Minesweeper {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[][] gameBoard = {   {0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0},
                                {0, -1, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0},
                                {0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0},
                                {0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, -1},
                                {0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0}};

        int mineCounter = countMines(gameBoard);

        int[][] boardWithHints = generateHints(gameBoard);

        // Print out the board information
        for (int i = 0; i < boardWithHints.length; i++) {
            for (int j = 0; j < boardWithHints[i].length; j++) {
                if (boardWithHints[i][j] < 0) {
                    System.out.print("M ");
                } else {
                    System.out.print(boardWithHints[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("The board has: " + mineCounter + " mines");

        // Compute the statistics
        int[] stat = computeStatistics(boardWithHints);
        for (int i = 0; i < stat.length; i++) {
            System.out.print(stat[i] + " ");
        }
    }

    public static int countMines(int[][] gameBoard){
        int counter = 0;
        for(int i = 0; i<gameBoard.length;i++){
            for(int j=0; j< gameBoard[i].length;j++){
                if(gameBoard[i][j] == -1){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int[][] generateHints(int[][] gameBoard){
        int[][] boardWithHints = new int[gameBoard.length][gameBoard[0].length];

        for(int i = 0; i< gameBoard.length;i++){
            for(int j = 0; j<gameBoard[i].length;j++){
                if(gameBoard[i][j]==-1){
                    boardWithHints[i][j] = -1; //copy the mines into the new gameBoard

                    // Increase the hint counter on all positions around the mine
                    // First always check if we are still in array bounds,
                    // then check that we do not overwrite a mine
                    if (i - 1 >= 0 && gameBoard[i - 1][j] != -1) {
                        boardWithHints[i - 1][j]++;
                    }
                    if (i + 1 < gameBoard.length && gameBoard[i + 1][j] != -1) {
                        boardWithHints[i + 1][j]++;
                    }
                    if (j - 1 >= 0 && gameBoard[i][j - 1] != -1) {
                        boardWithHints[i][j - 1]++;
                    }
                    if (j + 1 < gameBoard[i].length && gameBoard[i][j + 1] != -1) {
                        boardWithHints[i][j + 1]++;
                    }
                }
            }
        }

        return boardWithHints;
    }

    public static int[] computeStatistics(int[][] gameBoard){
        int[] stats = new int[5];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] >= 0)
                    stats[gameBoard[i][j]]++;
            }
        }
        return stats;
    }

}
