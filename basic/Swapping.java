package basic;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		
	int a,b,c ;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value a is :");
    a = scan.nextInt();
    System.out.println("Enter the value b is :");
    b= scan.nextInt();
    scan.close();
    c=a+b;
    b=c-b;
    a=c-a; 
    System.out.println("Swapped values: a = " + a + ", b = " + b);
      
      
	
	}
}
