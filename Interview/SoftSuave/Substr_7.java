package SoftSuave;

//		String s="ABADABAD"; String s1="BAD";
import java.util.Scanner;

public class Substr_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Input strings
		System.out.println("Enter the main string:");
		String mainString = scanner.nextLine();
		System.out.println("Enter the substring:");
		String subString = scanner.nextLine();
		// Count occurrences
		int totalOccurrences = countOccurrences(mainString, subString)
				+ countOccurrences(new StringBuilder(mainString).reverse().toString(), subString);
		// Print the result
		System.out.println("Total occurrences: " + totalOccurrences);
	}

	// Function to count occurrences of a substring in a given string
	public static int countOccurrences(String str, String sub) {
		int count = 0;
		int n = str.length(); // n=5 //BABAB
		int m = sub.length(); // m=3 //BAB
		
		for (int i = 0; i <= n - m; i++) {
			boolean match = true;
			for (int j = 0; j < m; j++) {
				if (str.charAt(i + j) != sub.charAt(j)) { // 20 //31 //42
					match = false;
					break;
				}
			}
			if (match) {
				count++;
			}
		}
		return count;
	}

}
