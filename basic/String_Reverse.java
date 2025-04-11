package basic;

import java.util.Scanner;

public class String_Reverse {
	
	public static void reverse(String s) {
		
		String res ="";
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			res+=c;
		}
		if(res.equals(res)) {
			System.out.println("The given string is palindrome");
		}else {
			System.out.println("The given string is not palindrome");
		}

	}
	public static void main(String[] args) {
		
		System.out.println("Enter a string :");
		Scanner s = new Scanner(System.in);
		
	    String input = s.nextLine();
		s.close();
	    StringBuffer sb = new StringBuffer(input);
		
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		
		StringBuilder reversed = new StringBuilder(input);
		System.out.println(reversed.reverse());
		
		reverse(input);
		
	}

}
