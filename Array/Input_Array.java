package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input_Array {

	public static void main(String[] args) {

		System.out.println("Enter the size of the array :");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int array[] = new int[n];
		
		System.out.println("Enter the element of the array :");
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		s.close();
		System.out.println("The elements are :");
		for(int i=0;i<n;i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println();
		for(int i:array) {
			System.out.print(i+",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(array));

	}

}
