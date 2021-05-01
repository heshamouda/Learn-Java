package exam1.solutions;

import java.util.Random;
import java.util.Scanner;

public class Memory {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int boardSize = 2;
        int numberOfCards = boardSize * boardSize / 2;
        int foundCards = 0;
        int numberOfRounds = 0;
        int[][] gameBoard = createGameBoard(boardSize);

        int[][] displayBoard = createDisplayBoard(boardSize);
        System.out.println("Have fun with the memory!");
        printGameBoard(displayBoard);
        do {
            // get the row, column for the first card
            int[] firstInput = getUserInput(displayBoard);
            // reveal and return the value of the first card
            int firstHint = getHint(gameBoard, firstInput[0], firstInput[1]);
            displayRevealed(displayBoard, firstInput[0], firstInput[1], firstHint,
                        -1, -1, -1);

            // get the row, column for the second card
            int[] secondInput = getUserInput(displayBoard);
            // reveal and return the value of the second card
            int secondHint = getHint(gameBoard, secondInput[0], secondInput[1]);
            displayRevealed(displayBoard, firstInput[0], firstInput[1], firstHint,
                            secondInput[0], secondInput[1], secondHint);
            //if first and second are correct --> keep them visible
            //else remove them from the display board
            if (firstHint == secondHint) {
                displayBoard[firstInput[0]][firstInput[1]] = firstHint;
                displayBoard[secondInput[0]][secondInput[1]] = secondHint;
                foundCards++;
            }
            System.out.println("Your current game board is:");
            printGameBoard(displayBoard);
            numberOfRounds++;
        } while (numberOfCards != foundCards);

        System.out.println("Congratulations you solved the puzzle in "
                + numberOfRounds + " rounds");

    }


    public static int[][] createGameBoard(int size) {
        Random random = new Random();
        int[][] gameBoard = new int[size][size];
        int numCards = size * size / 2;

        for (int i = 1; i <= numCards; i++) {
            int row;
            int column;
            do {
                //Place first card
                row = random.nextInt(size);
                //get second position
                column = random.nextInt(size);
            } while (gameBoard[row][column] != 0);
            gameBoard[row][column] = i;

            //Place second card
            do {
                row = random.nextInt(size);
                //get second position
                column = random.nextInt(size);
            } while (gameBoard[row][column] != 0);
            gameBoard[row][column] = i;
        }
        return gameBoard;
    }

    public static void printGameBoard(int[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getHint(int[][] gameBoard, int row, int column) {
        int card = gameBoard[row][column];
        return card;
    }

    public static void displayRevealed(int[][] displayBoard, int row1, int col1, int card1, int row2, int col2, int card2){
        for(int i = 0; i<displayBoard.length;i++){
            for(int j = 0; j<displayBoard[i].length;j++){
                if(i == row1&&j==col1){
                    System.out.print(card1 + " ");
                }else if(i == row2 && j == col2){
                    System.out.print(card2 + " ");
                }else{
                    System.out.print(displayBoard[i][j]+ " ");
                }
            }
            System.out.println();
        }
    }

    public static int[] getUserInput(int[][] displayBoard) {
        //read in first hint
        //display board with first hint
        int[] values = new int[2];
        int row = 0;
        int column = 0;
        do {
            System.out.println("Please enter row: ");
            row = scanner.nextInt();
            System.out.println("Please enter column:");
            column = scanner.nextInt();
        } while (row >= displayBoard.length || column >= displayBoard[row].length || displayBoard[row][column] != -1);
        values[0] = row;
        values[1] = column;
        return values;
    }

    public static int[][] createDisplayBoard(int size){
        int[][] displayBoard = new int[size][size];
        for (int i = 0; i < displayBoard.length; i++) {
            for (int j = 0; j < displayBoard[i].length; j++) {
                displayBoard[i][j] = -1;
            }
        }
        return displayBoard;
    }
}
