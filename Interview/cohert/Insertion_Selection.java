package cohert;

import java.util.Arrays;

public class Insertion_Selection {

	public static void main(String[] args) {
		
		int[] arr= {2,1,3,6,5,4};
		int len=arr.length;;
		
		//INSERTION
		for(int i=1;i<len;i++) {
			int key=arr[i];
			int j=i-1;
			while(j >=0 && key<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
		}
		
		System.out.println(Arrays.toString(arr));
		//SELECTION
		for(int i=0;i<len-1;i++) {
			int index=i;
			for(int j=i+1;j<len;j++) {
				if(arr[j] > arr[index])
					index=j;
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		
		System.out.println(Arrays.toString(arr));

		
	}
	
	
}
