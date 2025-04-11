package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
	public static  int binary_Search(int arr[],int target) {
		int n = arr.length;
		int start = 0,end = n - 1;
		while(start <= end) {
			int mid = (start + end) /2;
			//int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}return -1;
	}
	 public static void main(String[] args){
	        int[] arr = {13,32,61,97,35,65,43};
	        // Sorting the Given Array
	        Arrays.sort(arr);    
	        System.out.print("The Given Array is : ");
	        
	        // Printing the array using loops
	        for(int i:arr){
	            System.out.print(i + " ");
	        }System.out.println();
	        
	        // First Method
	        System.out.println("Enter the element to search : ");
	        Scanner s = new Scanner(System.in);
	        int target = s.nextInt();
	        int res1 = binary_Search(arr,target);
			if (res1 != -1) {
				System.out.println("Element is found at position: " + (res1 + 1));
			} else {
				System.out.println("Element not found in the array.");
			}
			
			// Second Method
			System.out.println("Enter the element to search : ");
			int input = s.nextInt();
	        int res = Arrays.binarySearch(arr,input);    // using binarysearch function
	        System.out.println("Element is Found at " + (res+1) + " Position." );
	        s.close();
      }	
}
