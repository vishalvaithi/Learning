package Dsa;

import java.util.Scanner;

public class Stack {
	static int top=-1;
	static int arr[] = new int[30];
	
	static void push(int num) {
		
		if(top==arr.length-1) {
			System.out.println("Stack Overflow ,Cannot push elements");
		}
		else {
			arr[++top]=num;
			System.out.println("Element is push successfully");
		}
	}
	static void pop() {
		
		if(top==-1) {
			System.out.println("Stack Underflow,no element to pop");
		}
		else {
			System.out.println("Element is pop successfully "+arr[top]);
			arr[top--]=0;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many operation you will do ");
		int temp=s.nextInt();
		int temp1=0;
		while(temp1<temp) {
		System.out.println("Enter the choice : ");
		System.out.println("1.Push\n2.Pop");
		
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the element to push : ");
			int p1=s.nextInt();
			push(p1);
			break;
		case 2:
			pop();
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
		temp1++;
		}
		s.close();
		System.out.println("Elements in array are :");
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

