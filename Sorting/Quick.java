package Sorting;

import java.util.Arrays;

public class Quick {

	public static void Quick_Sort(int arr[],int low,int high) {
		//QUICK SORT IS PREFER IN ARRAY BUT MERGE SORT IS PREFER IN LINKED LIST BECAUSE OF SPACE COMPLLEXITY
		if(low >= high) {
			return;
		}
		int start = low;
		int end = high;
		int mid = (start + end)/2;
		int pivot = arr[mid];
		while(start <= end) {
			while(arr[start] < pivot) {
				start++;
			}while(arr[end] > pivot) {
				end--;
			}
			if(start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--; 
			}
		}
		Quick_Sort(arr,low,end);
		Quick_Sort(arr,start,high);
	}
	
	public static void main(String[] args) {
		int arr[] = {2,1,5,3,8,6,4,7};
		Quick_Sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
