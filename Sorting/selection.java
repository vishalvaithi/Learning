  package Sorting;

import java.util.Scanner;

public class selection {

	public static void selection_Sort(int arr[]) {
		//better and more efficient
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int temp = i;
			for(int j=i+1;j<n;j++) {
				if (arr[j] < arr[temp]) {
					temp = j;
				}
			}
			int temp1 = arr[i]; 
			arr[i] = arr[temp];
			arr[temp] = temp1;
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
	
		selection_Sort(arr);
		System.out.println("The sorted array in asc : ");
		for(int i=0;i<input;i++) {
			System.out.print(arr[i] + " ");
		}
		
	} 
}
