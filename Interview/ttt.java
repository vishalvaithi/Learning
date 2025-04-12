import java.util.Scanner;
public class ttt {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Player vs Player");
			System.out.println("2.Player vs computer");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				playerVsplayer(s);
				break;
			case 2:
				playerVscomputer(s);
				break;
			case 3:
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}while(choice!=3);
	}
	
	private static void playerVsplayer(Scanner s) {
		char board[]= {'1','2','3','4','5','6','7','8','9'};
		char player='X';
		boolean over=false;
		while(!over) {
			printBoard(board);
			int move;
			while(true) {
				System.out.println("Player"+player+", enter a position(1-9):");
				move=s.nextInt();
				if(validMove(board,move,player)) {
					break;
				}else {
					System.out.println("Invalid choice...");
				}
			}
			board[move-1]=player;
			if(checkWinnig(player,board)) {
				printBoard(board);
				System.out.println("player "+player+" is win");
				over=true;
			}
			else if(checkDraw(player,board)) {
				printBoard(board);
				System.out.println("Match tie");
				over=true;
			}
			player=(player=='X')?'O':'X';
		}
	}

	private static void playerVscomputer(Scanner s) {
		char board[]= {'1','2','3','4','5','6','7','8','9'};
		char player='X';
		boolean over=false;
		while(!over) {
			printBoard(board);
			int move;
			if(player=='X') {
			while(true) {
				System.out.println("Player"+player+", enter a position(1-9):");
				move=s.nextInt();
				if(validMove(board,move,player)) {
					break;
				}else {
					System.out.println("Invalid choice...");
				}
			}
			board[move-1]=player;
			}
			else {
				aiMove(player,board);
			}
			if(checkWinnig(player,board)) {
				printBoard(board);
				System.out.println("player "+player+" is win");
				over=true;
			}
			else if(checkDraw(player,board)) {
				printBoard(board);
				System.out.println("Match tie");
				over=true;
			}
			
			player=(player=='X')?'O':'X';	
		}
	}
	
	private static void printBoard(char[] board) {
		System.out.println("-----------");
		System.out.println(board[0]+"  | "+board[1]+" | "+board[2]);
		System.out.println("-----------");
		System.out.println(board[3]+"  | "+board[4]+" | "+board[5]);
		System.out.println("-----------");
		System.out.println(board[6]+"  | "+board[7]+" | "+board[8]);
		System.out.println("-----------");
	}

	private static boolean checkWinnig(char p,char[] board) {
		if((board[0]==p &&board[1]==p &&board[2]==p)||(board[3]==p &&board[4]==p && board[5]==p )||(board[6]==p &&board[7]==p &&board[8]==p)) {
			return true;
		}
		if((board[0]==p &&board[3]==p &&board[6]==p)||(board[1]==p &&board[4]==p && board[7]==p )||(board[2]==p &&board[5]==p &&board[8]==p)) {
			return true;
		}
		if((board[2]==p &&board[4]==p &&board[6]==p)||(board[0]==p &&board[4]==p && board[8]==p )) {
			return true;
		}
		return false;
	}
	
	private static boolean checkDraw(char p,char[] board) {
		for(char x:board) {
			if(Character.isDigit(x))
				return false;
		}
		return true;
	}
	
	public static boolean validMove(char[] board,int move,char player) {
		if(Character.isDigit(board[move-1])) {
			return true;
		}
		return false;
	}
	
	private static void aiMove(char p,char[] board) {
		
		for(int i=0;i<9;i++) {
			if(Character.isDigit(board[i])) {
				board[i]=p;
				if(checkWinnig(p,board)) {
					return;
				}
				board[i]=(char) ('0'+i+1);
			}
		}
		for(int i=0;i<9;i++) {
			if(Character.isDigit(board[i])) {
				board[i]='X';
				if(checkWinnig('X',board)) {
					board[i]='O';
					return;
				}
				board[i]=(char) ('0'+i+1);
			}
		}
		if(Character.isDigit(board[4])) {
			board[4]=p;
			return;
		}
		if(board[0]=='X'&&board[8]=='X') {
			board[1]=p;
			return;
		}
		if(board[2]=='X'&&board[6]=='X') {
			board[1]=p;
			return;
		}
		if(Character.isDigit(board[0])) {
			board[0]=p;
			return;
		}
		if(Character.isDigit(board[2])) {
			board[2]=p;
			return;
		}
		if(Character.isDigit(board[6])) {
			board[6]=p;
			return;
		}
		if(Character.isDigit(board[8])) {
			board[8]=p;
			return;
		}
		
		for(int i=0;i<9;i++) {
			if(Character.isDigit(board[i]))
				board[i]=p;
				return;
		}
	}
	
}
