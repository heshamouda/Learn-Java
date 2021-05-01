package lecture3.solutions.programming;

import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many players do you have?");
        int players = sc.nextInt();
        System.out.println("How many rounds to you play");
        int rounds = sc.nextInt();

        // Declare variables
        int[][] results = new int[players][rounds];

        int[] sum = new int[players];
        int[] strikes = new int[players];
        int[] firstStrike = new int[players];
        int[] fouls = new int[players];

        // Read in all result values
        for (int i = 0; i < rounds; i++) {
            System.out.println("Results for round " + (i + 1));
            for (int j = 0; j < players; j++) {
                do {
                    System.out.println("Player " + (j + 1) + ": ");
                    results[j][i] = sc.nextInt();
                    if (results[j][i] < 0 || results[j][i] > 10) { // Check if the number is valid
                        System.out.println("Result not possible. Please enter possible value");
                    }
                } while (results[j][i] < 0 || results[j][i] > 10); // repeat this loop until we get a valid result
            }
        }


        // Compute results for all players
        for (int i = 0; i < players; i++) {
            sum[i] = 0;
            strikes[i] = 0;
            firstStrike[i] = 0;
            fouls[i] = 0;
            for (int j = 0; j < rounds; j++) {
                sum[i] = sum[i] + results[i][j]; // Compute the sum
                if (results[i][j] == 10) { // Check if we have a strike
                    strikes[i]++;
                    if (firstStrike[i] == 0) {
                        firstStrike[i] = j + 1;
                    }
                }
                if (results[i][j] == 0) { // Check if we have a foul
                    fouls[i]++;
                }
            }
        }

        // Output
        System.out.print("Player\t\t");
        for (int i = 0; i < players; i++) {
            System.out.print((i + 1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < rounds; i++) {
            System.out.print("Round " + (i + 1) + ":\t");
            for (int j = 0; j < players; j++) {
                System.out.print(results[j][i] + "\t");
            }
            System.out.println();
        }
        System.out.print("Sum\t\t\t");
        for (int i = 0; i < players; i++) {
            System.out.print(sum[i] + "\t");
        }
        System.out.println();
        System.out.print("Strikes\t\t");
        for (int i = 0; i < players; i++) {
            System.out.print(strikes[i] + "\t");
        }
        System.out.println();
        System.out.print("1.Strike\t");
        for (int i = 0; i < players; i++) {
            if (firstStrike[i] > 0) {
                System.out.print(firstStrike[i] + "\t");
            } else {
                System.out.print("\t");
            }
        }
        System.out.println();
        System.out.print("Fouls\t\t");
        for (int i = 0; i < players; i++) {
            System.out.print(fouls[i] + "\t");
        }
        System.out.println();
        // Calculate winner
        int winner = 0;
        for (int i = 0; i < players; i++) {
            if (sum[winner] < sum[i]) {
                winner = i;
            }
        }
        System.out.println("Winner is player " + (winner + 1));
    }
}
