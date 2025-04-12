package Zoho;
import java.util.Arrays;
public class product {	
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5};
        int n = arr.length;
        int[] prod = new int[n];

  //Method 1 - O(1) 
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            prod[i] = leftProduct;//1,1,2,6,24
            leftProduct *= arr[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            prod[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        
        System.out.println(Arrays.toString(prod));
        
  //Method 2 - O(n)
        int[] left = new int[n];//1,1,2,6,24 - //1,2,3,4,5
        int[] right = new int[n];//120,60,20,5,1  -  //5,4,3,2,1

        left[0] = 0;
        for (int i = 1; i < n; i++) {
            left[i] = arr[i - 1] + left[i - 1];
        }

        right[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = arr[i + 1] + right[i + 1];
        }

        for (int i = 0; i < n; i++) {
            prod[i] = left[i] + right[i];
        }
        
        System.out.println(Arrays.toString(prod));

        
   //Method3 - O(n2)
        for(int i=0;i<n;i++) {
        	int sum=1;
        	for(int j=0;j<n;j++) {
        		if(i!=j) {
        			sum=sum*arr[j];
        		}
        	}
        	prod[i]=sum;
        }
        
        System.out.println(Arrays.toString(prod));        
	
	}

}
