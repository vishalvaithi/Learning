package SoftSuave;

import java.util.Scanner;

public class Main_8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		// String s = "if man was meant to stay on the ground god would have given us
		// roots";
		String s = sc.nextLine();
		s = s.replace(" ", "");
		int L = s.length();

		int rows = (int) Math.sqrt(L);
		int columns = (rows * rows < L) ? rows + 1 : rows;

		StringBuilder encryptedMessage = new StringBuilder();
		for (int i = 0; i < columns; i++) {
			for (int j = i; j < L; j += columns) { // 0
				encryptedMessage.append(s.charAt(j));
			}
			encryptedMessage.append(" ");
		}
		System.out.println(encryptedMessage.toString());
	}

}
