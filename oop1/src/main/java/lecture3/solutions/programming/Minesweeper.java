package lecture3.solutions.programming;

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

        int mineCounter = 0;

        // Iterate over all board positions
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] == -1) {    // if we have a mine
                    // Increase the mine counter
                    mineCounter++;

                    // Increase the hint counter on all positions around the mine
                    // First always check if we are still in array bounds,
                    // then check that we do not overwrite a mine
                    if (i - 1 >= 0 && gameBoard[i - 1][j] != -1) {
                        gameBoard[i - 1][j]++;
                    }
                    if (i + 1 < gameBoard.length && gameBoard[i + 1][j] != -1) {
                        gameBoard[i + 1][j]++;
                    }
                    if (j - 1 >= 0 && gameBoard[i][j - 1] != -1) {
                        gameBoard[i][j - 1]++;
                    }
                    if (j + 1 < gameBoard[i].length && gameBoard[i][j + 1] != -1) {
                        gameBoard[i][j + 1]++;
                    }
                }
            }
        }

        // Print out the board information
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] < 0) {
                    System.out.print("M ");
                } else {
                    System.out.print(gameBoard[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("The board has: " + mineCounter + " mines");

        // Compute the statistics
        int[] stat = new int[5];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] >= 0)
                    stat[gameBoard[i][j]]++;
            }
        }



        for (int i = 0; i < stat.length; i++) {
            System.out.print(stat[i] + " ");
        }
    }

}
