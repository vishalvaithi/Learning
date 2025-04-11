package basic;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		long i,n,fact = 1,res = 1;
		System.out.println("Find the factorial num is :");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.close();
		if (n==0) {
			System.out.println("Factorial is " + 1);
		}
		else {
			for (i=1;i<=n;i++) {
				fact = fact*i;
		     }
		System.out.println("Factorial is " + fact);
		}
		
		while(n>0) {
			res = res*n--;
		}
		System.out.println("The second method factorial is : " + res);
	}
}
