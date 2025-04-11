package basic;

import java.util.Scanner;

public class Prime_Num {
	private static void prime(int n) {
		if(n==0 || n==1) {
			System.out.println("Num is not prime");
		}
		else {
			int f=0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					f=1;
					break;
				}
			}
		if(f==0) {
			System.out.println("Num is prime");
		}
		else {
			System.out.println("Num is not prime");
		}
	}
}

	public static void main(String[] args) {
		System.out.println("Enter a num :");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		prime(n);
		}
}
