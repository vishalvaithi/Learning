package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
	
	public static int[] merge_Sort(int arr[]) {
		int n = arr.length;
		if(n==1) {
			return arr;
		}
		int  mid = n/2;
		int left[] = merge_Sort(Arrays.copyOfRange(arr, 0, mid));//copying the array
		int right[] = merge_Sort(Arrays.copyOfRange(arr, mid, n));
		
		return merge(left,right);
	}
	
	public static int[] merge(int first[],int second[]) {
		//MERGE SORT IS DIVIDE THE ARRAY AND CONTINUE..... nLOGn - TIME COMPLEXITY 
		int[] join = new int[first.length + second.length];
		int i=0,j=0,k=0;
		while(i < first.length && j < second.length) {
			if (first[i] < second[j]) {
				join[k] = first[i];
				k++;i++;
			}else {
				join[k] = second[j];
				k++;j++;
			}
		}
		while(i < first.length) {
			join[k] = first[i];
			k++;i++;
			}
		while(j < second.length) {
			join[k] = second[j];
			k++;j++;
			}
		return join;
 
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
	
		arr = merge_Sort(arr);
		System.out.println("The sorted array are : ");
		for(int i=0;i<input;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
