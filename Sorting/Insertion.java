package Sorting;

import java.util.Scanner;

public class Insertion {

	public static void insertion_Sort(int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
	 		int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j]; 
				j--;
			}
			arr[j+1] = key;
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
	
		insertion_Sort(arr);
		System.out.println("The sorted array are : ");
		for(int i=0;i<input;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
