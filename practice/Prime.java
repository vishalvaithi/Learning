package practice;

import java.util.Scanner;

public class Prime {

	private static boolean prime(int input) {
		if(input <=  1) {
			return false;
		}
		if(input == 2 || input == 3) {
			return true;
		}
		if(input % 2 ==0 || input % 3 == 0) {
			return false;
		}
		for(int i=5; i*i <= input ; i += 6) {
			if(input%i==0 || input%(i+2) == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter a num :");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		boolean result = prime(n);
		
		if(result) {
			System.out.println("The num is prime");
		}else {
			System.out.println("The num is not prime");
		}

	}

}
