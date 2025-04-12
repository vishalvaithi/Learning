package GFG;

public class prime {

	public static int func(int num) {

		int reversed = 0;
		while (num > 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}
		return reversed;
	}

	static int isSumPalindrome(int n) {

		int rev = func(n);
		rev = rev + n;
		System.out.println(rev);
		int demo = func(rev);
		System.out.println(demo);
		if (demo == rev) {
			return demo;
		}else {
			rev = rev + demo;
			demo = func(rev);
			if (demo == rev) {
				return demo;
			}
		}
		return -1;

	}
	
	public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    // Helper function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    // Function to find the palindrome or return -1 if iterations exceed 5
    public static int findPalindrome(int n) {
        int iterations = 0;
        while (iterations < 5) { 
            int reversed = reverseNumber(n);
            n += reversed;
            if (isPalindrome(n)) {
                return n;
            }
            iterations++;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		
		System.out.println(findPalindrome(101));
	}

}
