package Zoho;

public class locker {
	
	public static void main(String[] args) {
		
		int arr1[]= {1,1,1,1};
		int arr2[]= {9,9,9,9};
		System.out.println(rotation(arr1,arr2));
	}

	private static int rotation(int[] arr1, int[] arr2) {

		int result=0;
		for(int i=0;i<arr1.length;i++) {
			int first=arr1[i],sec=arr2[i];
			int count1=0,count2=0;
			count1=Math.abs(sec-first);
			count2=10-count1;
			int temp=(count1<count2)?count1:count2;
			result=result+temp;
		}
		
		return result;
	}
}
