package SoftSuave;
import java.util.HashSet;
import java.util.Scanner;

public class LargestRepeatedSubstring_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        System.out.println("Longest repeated substring: " + findLongestRepeatedSubstring(input));
        scanner.close();

    }

    private static String findLongestRepeatedSubstring(String str) {
        String result = ""; // To store the largest repeated substring
        int n = str.length();

        for (int i = n; i > 0; i--) {
            HashSet<String> seen = new HashSet<>();
            for (int j = 0; j <= n - i; j++) {
                String substring = str.substring(j, j + i);
                System.out.println(substring);
                if (seen.contains(substring)) {
                    result = substring; // Update result with the repeated substring
                }
                seen.add(substring);
            }
            System.out.println(seen.toString());
            if (!result.isEmpty()) {
                break; 
            }
        }
        return result;
    }
}

//for(int i=0;i<3;i++) {
//	for(int j=0;j<2;j++) {
//		if(i==j) {
//			break;
//		}
//		else {
//			System.out.println(i+""+j);
//		}
//		System.out.println("Hi");
//	}
//}