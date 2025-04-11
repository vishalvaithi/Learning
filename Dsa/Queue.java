package Dsa;

import java.util.Scanner;

public class Queue {
	static int arr[] = new int[30];
	static int front=0,rear=-1;
	
	static void enqueue(int num) {
		
		if(rear==arr.length-1) {
			System.out.println("Queue Overflow ,Cannot Enqueue elements");
		}
		else {
			arr[++rear]=num;
			System.out.println("Element is Enqueue successfully");
		}
	}
	static void dequeue() {
		
		if(front>rear) {
			System.out.println("Queue Underflow,no element to dequeue");
		}
		else {
			System.out.println("Element is dequeue successfully "+arr[front]);
			front++;
//			int temp=++front;
//			for(int i=0;i<rear;i++) {
//				arr[i]=arr[temp++];
//			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many operation you will do ");
		int temp=s.nextInt();
		int temp1=0;
		while(temp1<temp) {
		System.out.println("Enter the choice : ");
		System.out.println("1.Enqueue\n2.Dequeue");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the element to Enqueue : ");
			int p1=s.nextInt();
			enqueue(p1);
			break;
		case 2:
			dequeue();
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
		temp1++;
		}
		s.close();
		System.out.println("Elements in array are :");
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
