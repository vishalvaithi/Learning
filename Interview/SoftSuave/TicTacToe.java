package SoftSuave;
//import java.util.Random;
import java.util.Scanner;
public class TicTacToe {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {	
		System.out.println("Choose your choice :\n1.Player to player\n2.computer play ");
		int choice = s.nextInt();
		char again='y';
		while(again=='y') {
			char board[][]= {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
			if(choice == 1) 
				gamePlay1(board);
			else
				gamePlay2(board);
				
			System.out.println("you want to play again (y or n):");
			again=s.next().charAt(0);
			if(again=='n') 
				System.out.println("Thank you for playing...");
		}
	}
	
	private static void gamePlay2(char[][] board) {
		boolean gameOver=false;
		System.out.println("do you want play (X or O) : ");
		char userSymbol=s.next().charAt(0);
		char computerSymbol=(userSymbol=='X')?'O':'X';
		char player=(userSymbol=='X')?userSymbol:computerSymbol;//decide the first move player or computer
		int move;
		while(!gameOver) {
			printBoard(board);
			if(player==userSymbol) {
				while(true) {
				System.out.println("Enter a your move (1-9) :");
				move=s.nextInt();
				if(move>=1 && move<=9 && isValidMove(board,move)) 
					break;
				else 
					System.out.println("Move is invalid or out of range...");
				}
				placeMove(board,player,move);
			}
			else {
				System.out.println("Computer play...");
				makeMove(board,player);
			}
			gameOver=gameWin(board,player);
			if(gameOver) {
				printBoard(board);
				System.out.println("The player "+player+" has won");
			}else if(isBoardFull(board)) {
				printBoard(board);
				System.out.println("The match tie..");
				gameOver=true;
			}else {
				player=(player=='X')?'O':'X';
			}
		}
	}
	
	private static void makeMove(char[][] board,char player) {
		if(winnigMove(board,player))
			return;
		char opponent=(player=='X')?'O':'X';
		if(blockMove(board,opponent))
			return;
		trickMove(board,player);	
	}
	
	private static void trickMove(char[][] board, char player) {	
		int[] preferredMove= {1,3,7,9,5,2,4,6,8};
		for(int move:preferredMove) {
			if(isValidMove(board,move)) 
				placeMove(board,player,move);
				return;
		}
	}
	
	private static boolean blockMove(char[][] board,char opponent) {
		for(int move=1;move<=9;move++) {
			if(isValidMove(board,move)) {
				//placeMove(board,oppponent,move);
				board[(move-1)/3][(move-1)%3]=opponent;
				if(gameWin(board,opponent)) {
					board[(move-1)/3][(move-1)%3]=(opponent =='X')?'O':'X';//block opponent move
					return true;
				}else {
					board[(move-1)/3][(move-1)%3]=(char) ( '0' + move);//undo
				}
			}
		}return false;
	}
	
	private static boolean winnigMove(char[][] board, char player) {
		for(int move=1;move<=9;move++) {
			if(isValidMove(board,move)) {
				placeMove(board,player,move);
				//board[(move-1)/3][(move-1)%3]='O';
				if(gameWin(board,player)) {
					return true;
				}else {
					board[(move-1)/3][(move-1)%3]=(char) ('0'+move);//undo
				}
			}
		}return false;
	}
	
	private static void gamePlay1(char[][] board) {
		boolean gameOver=false;
		char player='X';
		int move;
		while(!gameOver) {
		  printBoard(board);
		  while(true) {
			 System.out.println("Enter player "+player+" move (1-9) :");
			 move=s.nextInt();
			 if(move>=1 && move<=9 && isValidMove(board,move)) 
				 break;
			 else 
				 System.out.println("Move is invalid or out of range...");
		  }
		  placeMove(board,player,move);
		  gameOver=gameWin(board,player);	  
		  if(gameOver) {
			  printBoard(board);
			  System.out.println("The player "+player+" has won");
		  }else if(isBoardFull(board)) {
			  printBoard(board);
			  System.out.println("The match tie..");
			  gameOver=true;
		  }else {
			  player=(player=='X')?'O':'X';
		  }
		}
	}
	
	private static boolean isBoardFull(char[][] board) {
		for(char[] chars:board) {
			for(char x:chars) {
				if(x!='X' && x!='O') {
					return false;
				}
			}
		}return true;
	}
	
	private static boolean gameWin(char[][] board, char player) {
		for(int row=0;row<board.length;row++) {
			if(board[row][0]==player && board[row][1]==player && board[row][2]==player) {
				return true;
			}
		}
		for(int col=0;col<board.length;col++) {
			if(board[0][col]==player && board[1][col]==player && board[2][col]==player) {
				return true;
			}
		}
		if(board[0][0]==player && board[1][1]==player && board[2][2]==player) 
			return true;
		if(board[0][2]==player && board[1][1]==player && board[2][0]==player) 
			return true;
		
		return false;
	}
	
	private static void placeMove(char[][] board, char player, int move) {
		board[(move-1)/3][(move-1)%3]=player;
	}
	
	private static void printBoard(char[][] board) {
		System.out.println("-----------------");
		for(int row=0;row<board.length;row++) {
			for(int col=0;col<board.length;col++) {
				System.out.print(" "+board[row][col]+" ");
				if(col<board.length) {
					System.out.print(" | ");
				}
			}System.out.println();
			if(row<board.length)
				System.out.println("-----------------");
		}
	}
	
	private static boolean isValidMove(char[][] board,int move) {
		return board[(move-1)/3][(move-1)%3] != 'X' && board[(move-1)/3][(move-1)%3] !='O';
	}
}