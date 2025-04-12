package cohert;

public class checkPalindrome {
	
	public static long reverseNum(long num) {
		
		long rev=0;
		while(num>0) {
			long rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}

	public static boolean palindrome(long num) {
		return num==reverseNum(num);
	}
	
	public static void main(String[] args) {
		
		long num=799991;
		boolean res=true;
		while(res) {
			if(palindrome(num)) {
				System.out.println("The num "+num+" is a palindrome");
				res=false;
				return;
			}
			System.out.print(num+"+"+reverseNum(num)+"=");
			num=num+reverseNum(num);
			System.out.println(num);
		}
		
	}
}
