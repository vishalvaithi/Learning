package practice;

import java.util.Scanner;

public class Palindrome {
	private static boolean palindrome(String a) {
		//Method two
		for(int i=0;i<=a.length()/2;i++) {
			char start = a.charAt(i);
			char end = a.charAt(a.length()-1-i);	
		if(start != end) {
			return false;
		}
		}
		return true;
}
	public static void main(String[] args) {
		//Method One
		System.out.println("Enter a string : ");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine() ,b="";
		
		for(int i=1;i<=a.length();i++) {
			char res = a.charAt(a.length()-i);
			b += res;
		}
		System.out.println(b);
		if(a.equals(b)) {
			System.out.println("The given string is palindrome.");
		}else {
			System.out.println("The given string is not palindrome");
		}
		//Method two
		boolean check = palindrome(a);
		if(check){
			System.out.println("The given string is palindrome.");
		}else {
			System.out.println("The given string is not palindrome.");
		}
		
		System.out.println("The num is :");
		int num = s.nextInt();
		s.close();
		int num1 = num;
		int reversed = 0;
		while (num > 0) {
			int digit = num%10;
			reversed = reversed*10 + digit;
			num = num / 10;
		}
		System.out.println(reversed);
		if(num1 == reversed) {
			System.out.println("The given num is palindrome.");
		}else {
			System.out.println("The given num is not palindrome");
		}
	
	
	}

}
