package Question;

public class Least {
	
	private static void findleast(int[] arr) {
		
		int a=arr[0],b=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(a > arr[i]) {
				a=arr[i];
			}
		}
		System.out.println(a);
		
		for(int j=0;j<arr.length;j++) {
			if(a != arr[j] && b > arr[j]) {
			b=arr[j];
		}
	}
		System.out.println(b);
    }
	public static void main(String[] args) {
		
		int arr[] = {2,3,5,-6,9,-1};
		findleast(arr);
	}

	
}
