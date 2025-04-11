package Array;

import java.util.Arrays;

public class Sorting_Array {

	public static void main(String[] args) {
		 int a[] = {2,4,6,3,1,5};
		 int n = a.length;
		 //Method One - ascending order
		 Arrays.sort(a);
		 String res = Arrays.toString(a);
		 System.out.println(res);
		 for(int i=0;i<n;i++) {
			 System.out.print(a[i] + " ");
		 } 
		 System.out.println();
		 
		 //Method Second - descending order
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 if(a[i] < a[j]) {
					 int temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				 }
			 }
		 }
		 for(int i=0;i<n;i++) {
			 System.out.print(a[i] + " ");
		 }
	}
}
