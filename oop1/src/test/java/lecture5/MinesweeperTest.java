package lecture5;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MinesweeperTest {

    @Test
    public void testMineCount() {
        int[][] gameBoard = {{0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0},
                {0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, -1},
                {0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0}};

        int mineCount = Minesweeper.countMines(gameBoard);

        assertEquals(17, mineCount);
    }

    @Test
    public void testHintGeneration() {
        int[][] gameBoard = {{0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0},
                {0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, -1},
                {0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0}};

        int[][] expectedGameBoard = {{0, 1, 1, -1, 1, 1, -1, 2, 1, 0, 1, -1, 1, 0, 0},
                {1, -1, 1, 2, 0, 0, 3, -1, -1, 1, 1, -1, 2, 1, 0},
                {0, 1, 1, -1, 1, 1, -1, 2, 1, 0, 0, 3, -1, -1, 2},
                {0, 0, 1, -1, 1, 1, -1, 1, 1, 0, 1, -1, 2, 3, -1},
                {0, 0, 0, 1, 0, 0, 1, 1, -1, 1, 0, 1, 1, -1, 2}};

        int[][] computedGameBoard = Minesweeper.generateHints(gameBoard);

        for(int i = 0; i<expectedGameBoard.length;i++){
            assertArrayEquals(expectedGameBoard[i], computedGameBoard[i]);
        }
    }

    @Test
    public void testStatistics(){
        int[][] gameBoard = {{0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, 0},
                {0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, -1},
                {0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0}};
        int[] expectedStatistics = {19, 29, 7, 3, 0};
        int[][] computedGameBoard = Minesweeper.generateHints(gameBoard);
        int[] statistics = Minesweeper.computeStatistics(computedGameBoard);
        assertArrayEquals(expectedStatistics, statistics);
    }

}
