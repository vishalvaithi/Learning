package Sorting;

import java.util.Arrays;

public class Merge2 {
	public static void merge_Sort(int arr[],int start,int end) {
		if(end - start == 1) {
			return;
		}
		int mid = (start + end)/2;
		merge_Sort(arr,start,mid);
		merge_Sort(arr,mid,end);
		merge(arr,start,mid,end);
	}
	
	public static void merge(int arr[],int s,int m,int e) {
		int join[] = new int[e - s];
		int i=s,j=m,k=0;
		
		while(i < m && j < e) {
			if(arr[i] < arr[j]) {
				join[k] = arr[i];
				k++;i++;
			}else {
				join[k] = arr[j];
				k++;j++;
			}
		}
		while(i < m) {
			join[k] = arr[i];
			k++;i++;
		}
		while(j < e) {
			join[k] = arr[j];
			k++;j++;
		}
		for(k=0;k<join.length;k++) {
			arr[s+k] = join[k]; 
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,1,5,3,8,6,4,7};
		merge_Sort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
