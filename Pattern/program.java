package Pattern;

public class program {

	public static void main(String[] args) {
		String word = "PROGRAM";
		int length = word.length();
		char[][] pattern = new char[length][length];

		// Initialize the pattern array with spaces
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				pattern[i][j] = ' ';
			}
		}

		// Fill the pattern array with the word characters
		for (int i = 0; i < length; i++) {
			pattern[i][i] = word.charAt(i);
//			pattern[i][length - 1 - i] = word.charAt(i);
		}
		for (int i = 0; i < length; i++) {
			pattern[i][length -1 -i] = word.charAt(length -1 -i);
		}
		

		// Print the pattern
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(pattern[i][j] + " ");
			}
			System.out.println();
		}
	}
}
