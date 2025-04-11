package basic;

import java.util.Scanner;

public class Palindrome {
	
	public static void func(int num) {
		
		int reversed = 0,copy=num;
		while (num > 0) {
			int digit = num%10;
			reversed = reversed*10 + digit;
			num = num / 10;
		}
		System.out.println(reversed);
		if(reversed==copy)
			System.out.println("The given num is palindrome");
		else
			System.out.println("The given num is not palindrome");
		
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the value :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		func(num);
		
		
	}

}
