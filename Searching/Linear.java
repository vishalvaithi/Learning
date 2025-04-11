package Searching;

import java.util.Scanner;

public class Linear {

	public static void search(int arr[] ,int item) {
			
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == item) {
				System.out.println("The item "+item+" index is :"+i);
				return ;
			}
		}
		System.out.println("Item is not found.");
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter the item to searching : ");
		Scanner scan = new Scanner(System.in);
		int item = scan.nextInt();
		search(arr,item);
		scan.close();
	}
}
