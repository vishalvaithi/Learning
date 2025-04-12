package GFG;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of array ");
		int size=s.nextInt();
		for(int i=0;i<size;i++){
			System.out.println("ENter the size of "+(i+1)+" array");
			int e=s.nextInt();
//			int arr[]=new int[e];
//			for(int j=0;j<e;j++) {
//				arr[e]
//			}
			List<Integer> a=new ArrayList<>();
			System.out.println("Enter the elements ");
			for(int j=0;j<e;j++) {
				int add=s.nextInt();
				a.add(add);
			}
			//list.add(a);
		}
		System.out.println(list);
		
		int arr[]= {5,4,3};
		for (int x : arr) {
			list.add(x);
		}
		System.out.println(list);
	}

}
