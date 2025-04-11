package Array;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		int a[] = {3,4,2,5,1};
		int b = a.length;
		int c[] = new int[b];
		for(int i=0;i<a.length;i++) {		
			c[i]=a[b-1 - i];
		}
		String res = Arrays.toString(c);
		System.out.println(res);
		
		//SECOND
		for(int i=b-1;i>=0;i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//THIRD METHOD
		int start = 0 , end = b-1;
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		String res2 = Arrays.toString(a);
		System.out.println(res2);
	}
}
