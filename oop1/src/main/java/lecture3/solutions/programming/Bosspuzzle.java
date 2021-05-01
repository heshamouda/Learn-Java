package lecture3.solutions.programming;

import java.util.Scanner;

public class Bosspuzzle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char[][] board = new char[3][3];
		int move_row, move_column, row_empty, column_empty;

		row_empty = 0;
		column_empty = 2;
		move_row = 0;
		move_column = 0;

		board[0][0] = '3';
		board[0][1] = '4';
		board[0][2] = ' ';
		board[1][0] = '7';
		board[1][1] = '8';
		board[1][2] = '5';
		board[2][0] = '2';
		board[2][1] = '1';
		board[2][2] = '6';

		System.out.println(" C 1 2 3");
		System.out.println("R -------");

		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + "| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		while (move_row != 9) {
			System.out.println("Which field would you like to move?");
			System.out.print("Row (9 for Cancel): ");
			move_row = scanner.nextInt();

			if (move_row != 9) {
				
				System.out.print("Column: ");
				move_column = scanner.nextInt();

				board[row_empty][column_empty] = board[move_row - 1][move_column - 1];
				board[move_row - 1][move_column - 1] = ' ';

				row_empty = move_row - 1;
				column_empty = move_column - 1;

				for (int i = 0; i < 3; i++) {
					System.out.print(i + 1 + "| ");
					for (int j = 0; j < 3; j++) {
						System.out.print(board[i][j] + " ");
					}
					System.out.println();
				}
			}

		}// while

	}// main
}// class