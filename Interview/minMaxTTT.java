
import java.util.Scanner;
import java.util.Random;

public class minMaxTTT {
    private static final char PLAYER = 'X';
    private static final char COMPUTER = 'O';
    private static final char EMPTY = ' ';
    private static final int SIZE = 3;
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nTic-Tac-Toe Menu");
            System.out.println("1. Player vs Player");
            System.out.println("2. Player vs Computer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1-3). Try again:");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> playGame(false);
                case 2 -> playGame(true);
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        scanner.close();
    }

    private static void playGame(boolean vsComputer) {
        char[][] board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
        
        char currentPlayer = PLAYER;
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard(board);
            if (vsComputer && currentPlayer == COMPUTER) {
                makeBestMove(board);
            } else {
                playerMove(board, currentPlayer);
            }
            
            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a draw!");
                gameEnded = true;
            }
            
            currentPlayer = (currentPlayer == PLAYER) ? COMPUTER : PLAYER;
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static void playerMove(char[][] board, char player) {
        int row, col;
        while (true) {
            System.out.print("Player " + player + ", enter row (1-3) and column (1-3): ");
            if (scanner.hasNextInt()) {
                row = scanner.nextInt() - 1;
            } else {
                scanner.next();
                System.out.println("Invalid input. Please enter numbers between 1-3.");
                continue;
            }
            if (scanner.hasNextInt()) {
                col = scanner.nextInt() - 1;
            } else {
                scanner.next();
                System.out.println("Invalid input. Please enter numbers between 1-3.");
                continue;
            }
            
            if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY) {
                board[row][col] = player;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void makeBestMove(char[][] board) {
        int[] bestMove = minimax(board, COMPUTER);
        board[bestMove[0]][bestMove[1]] = COMPUTER;
    }

    private static int[] minimax(char[][] board, char player) {
        int bestScore = (player == COMPUTER) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int[] bestMove = {-1, -1};

        if (checkWin(board, PLAYER)) return new int[]{-1, -1, -10};
        if (checkWin(board, COMPUTER)) return new int[]{-1, -1, 10};
        if (isBoardFull(board)) return new int[]{-1, -1, 0};

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == EMPTY) {
                    board[i][j] = player;
                    int score = minimax(board, (player == COMPUTER) ? PLAYER : COMPUTER)[2];
                    board[i][j] = EMPTY;

                    if ((player == COMPUTER && score > bestScore) || (player == PLAYER && score < bestScore)) {
                        bestScore = score;
                        bestMove = new int[]{i, j, bestScore};
                    }
                }
            }
        }
        return bestMove;
    }

    private static boolean checkWin(char[][] board, char player) {
        for (int i = 0; i < SIZE; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private static boolean isBoardFull(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
