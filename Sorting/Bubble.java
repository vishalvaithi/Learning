 package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
	public static void bubble_Sort(int arr[]) {
		//first -  Low Time
		int n = arr.length - 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
		}
} 
		//Second 
		for(int i=0 ;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			}
		}
	}
}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array : ");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int arr[] = new int[input];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<input;i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		System.out.println("The elements are : ");
		for(int i=0;i<input;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		bubble_Sort(arr);
		System.out.println("The sorted array are : ");
		for(int i=0;i<input;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		String res = Arrays.toString(arr);
		System.out.println("The sorted array are : " + res);
		
	}	
}
