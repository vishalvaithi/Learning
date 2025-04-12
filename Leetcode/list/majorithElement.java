package list;

import java.util.Arrays;

public class majorithElement {
	public static void main(String[] args) {

		int A[] = { 1, 1, 1 ,1,1,5,5,5,5,4,4,4,2};
		majorityElement1(A);		
	}	
		public static void majorityElement1(int[] A) {
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < A.length; i++) {
				if (A[i] > max)
					max = A[i];
			}

			int B[] = new int[max + 1];
			for (int i = 0; i < A.length; i++) {
				B[A[i]]++;
			}
			System.out.println(Arrays.toString(B));
			int temp=0;
			for (int i = 0; i <= max; i++) {
				if (B[i] > temp)
					temp=B[i];
					
			}
			for (int i = 0; i <= max; i++) {
				if(temp==B[i])
					System.out.println(i);
			}        
	    }
	
}
