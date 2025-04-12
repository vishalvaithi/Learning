package questionPaper;

public class lowestCommon {
	
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int[] arr2= {3,6,7,5};
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					if(min > arr1[i]) {
						min=arr1[i];
					}
				}
			}
		}
		System.out.println(min);
		
	}

}
