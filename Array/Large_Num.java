package Array;
public class Large_Num {
	public static void main(String[] args) {
		int arr[]= {66,77,44,88,55};
		int n=arr.length;
		
		//Find largest num
		int first = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] > first) {
				first = arr[i];
			}
		}
		System.out.println("The largest no of element in array :  " + first);
		
		//Find smallest num
		int second = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] < second) {
				second = arr[i];
			}
		}
		System.out.println("The smallest no of element in array :  " + second);
		
		//Find the second smallest num
		int fst= Integer.MAX_VALUE, sec= Integer.MAX_VALUE;
		for (int num : arr) {
	            if (num < fst) {
	                sec= fst;
	                fst= num;
	            } 
	            else if (num < sec&& num != fst) {
	                sec= num;
	            }
	        }
		System.out.println("The smallest no of element in array : "  + fst);
		System.out.println("THe second smallest no : "+ sec);
		
		//find average
		int avg = 0;
		for(int i=0;i<n;i++) {
			avg += arr[i];
		}
		int res = avg/n;
		System.out.println("The average of array is : " + res);
		
	}
}
