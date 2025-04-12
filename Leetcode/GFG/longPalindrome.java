package GFG;
class longPalindrome {
	private static boolean checkPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	// Static method to find the longest palindromic substring
	static String longestPalindrome(String s) {
		// code here
		// o(n^3) tc code
		int n = s.length();
		if (s == null || n == 0) {
			return "";
		}
		int start = 0;
		int maxLen = 1;
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (j - i + 1 > maxLen && checkPalindrome(s, i, j)) {
					maxLen = j - i + 1;
					start = i;
				}
			}
		}
		return s.substring(start, start + maxLen);
	}
	
	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("aaaabbaa"));
	}
}