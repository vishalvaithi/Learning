package cohert;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		
		int[] arr= {2,1,3,6,5,4};
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-1-i;j++) {
				if(arr[j]> arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
}
