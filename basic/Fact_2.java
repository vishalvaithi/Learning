package basic;

import java.util.Scanner;

public class Fact_2 {
	
	public static int func(int n) {
		if(n ==0 || n==1) {
			return 1;
		}
		else {
			return n*func(n-1);
		}
	}

	public static void main(String[] args) {
		int n,i;
		System.out.println("Find a factorial num is");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		s.close();
		int func = func(n);
		System.out.println(func);
		
		
		for(i=0;i<=n;i++) {
			System.out.println("Find the factorial of "+ i +" is :");
			int result = func(i);
			System.out.println(result);
		}
				
	}
	
}
