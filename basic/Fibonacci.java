package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter a series number :");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close(); 
		int arr[] = new int[n];
		int a = -1,b = 1,c;
		
		for(int i=0;i<n;i++) {
			c=a+b;
			System.out.println(c);
			arr[i] = c;
			a=b;
			b=c;
			
		}
		//change the array into string
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
