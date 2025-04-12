package SoftSuave;

import java.util.Scanner;

public class TictacToe1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTic-Tac-Toe Menu");
            System.out.println("1. Player vs Player");
            System.out.println("2. Player vs Computer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    playPlayerVsPlayer(scanner);
                    break;
                case 2:
                    playPlayerVsComputer(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void playPlayerVsPlayer(Scanner scanner) {
        char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard(board);

            // Get player's move
            int position;
            do {
                System.out.print("Player " + currentPlayer + ", enter a position (1-9): ");
                position = scanner.nextInt() - 1;
            } while (position < 0 || position > 8 || board[position] == 'X' || board[position] == 'O');

            // Make player's move
            board[position] = currentPlayer;

            // Check for win
            if (checkWin(currentPlayer, board)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a draw!");
                gameEnded = true;
            }

            // Switch players
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    private static void playPlayerVsComputer(Scanner scanner) {
        char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard(board);

            if (currentPlayer == 'X') { // Player's turn
                int position;
                do {
                    System.out.print("Player " + currentPlayer + ", enter a position (1-9): ");
                    position = scanner.nextInt() - 1;
                } while (position < 0 || position > 8 || board[position] == 'X' || board[position] == 'O');
                board[position] = currentPlayer;
            } else { // Computer's turn
                makeAIMove(board);
            }

            // Check for win
            if (checkWin('X', board)) {
                printBoard(board);
                System.out.println("Player wins!");
                gameEnded = true;
            } else if (checkWin('O', board)) {
                printBoard(board);
                System.out.println("Computer wins!");
                gameEnded = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a draw!");
                gameEnded = true;
            }

            // Switch players
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    private static void printBoard(char[] board) {
        System.out.println("-------------");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("-------------");
    }

    private static boolean checkWin(char player, char[] board) {
        // Check rows
        if ((board[0] == player && board[1] == player && board[2] == player) ||
                (board[3] == player && board[4] == player && board[5] == player) ||
                (board[6] == player && board[7] == player && board[8] == player)) {
            return true;
        }

        // Check columns
        if ((board[0] == player && board[3] == player && board[6] == player) ||
                (board[1] == player && board[4] == player && board[7] == player) ||
                (board[2] == player && board[5] == player && board[8] == player)) {
            return true;
        }

        // Check diagonals
        if ((board[0] == player && board[4] == player && board[8] == player) ||
                (board[2] == player && board[4] == player && board[6] == player)) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull(char[] board) {
        for (char c : board) {
            if (Character.isDigit(c)) {
                return false; // If any position is still a number, the board is not full
            }
        }
        return true;
    }

    private static void makeAIMove(char[] board) {
        // Find winning move for AI (if any)
        for (int i = 0; i < 9; i++) {
            if (Character.isDigit(board[i])) {
                board[i] = 'O';
                if (checkWin('O', board)) {
                    return;
                }
                board[i] = Character.forDigit(i + 1, 10); // Restore the original digit
            }
        }

        // Block player's winning move (if any)
        for (int i = 0; i < 9; i++) {
            if (Character.isDigit(board[i])) {
                board[i] = 'X';
                if (checkWin('X', board)) {
                    board[i] = 'O';
                    return;
                }
                board[i] = Character.forDigit(i + 1, 10); // Restore the original digit
            }
        }

        // Place AI move in the center if available
        if (Character.isDigit(board[4])) {
            board[4] = 'O';
            return;
        }

        // Place AI move in a corner if available
        if (Character.isDigit(board[0])) {
            board[0] = 'O';
            return;
        }
        if (Character.isDigit(board[2])) {
            board[2] = 'O';
            return;
        }
        if (Character.isDigit(board[6])) {
            board[6] = 'O';
            return;
        }
        if (Character.isDigit(board[8])) {
            board[8] = 'O';
            return;
        }

        // Place AI move in any empty space
        for (int i = 0; i < 9; i++) {
            if (Character.isDigit(board[i])) {
                board[i] = 'O';
                return;
            }
        }
    }
}