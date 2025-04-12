package String;

import java.util.Scanner;

public class IntToChar {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your number ");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		findChar(choice);
		System.out.println("Enter your String ");
		String s1=s.next();
		findChar(s1);
		
//		int c= 'A';
//		char c1=65;
//		System.out.println(c1);
//		System.out.println(c);
//		char s1='G';
//		int num=((int) s1-'A')+1;
//		System.out.println(num);
	}

	private static void findChar(int choice) {

		char num= (char) (choice+64);
		System.out.println(num);
		
		StringBuilder sb=new StringBuilder();
		while(choice > 0) {
			choice--;
			int rem=choice%26;
			char res=(char)(rem+'A');
			sb.append(res);
			choice=choice/26;
		}
		System.out.println("The character is : "+sb.reverse().toString());
				
	}
	private static void findChar(String s) {
		
		s=s.toUpperCase();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum = sum*26 + ((int) s.charAt(i)%65)+1;
		}
		System.out.println(sum);
//		int sum=((int) s.charAt(0)-'A')+1;
//		for(int i=1;i<s.length();i++) {
//			sum *= 26;
//			sum += ((int) s.charAt(i)-'A')+1;
//		}
//		System.out.println(sum);
			
		
		
}
}