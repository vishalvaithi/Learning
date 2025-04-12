package SoftSuave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class list_6 {
	public static void main(String[] args) {
		// Initialize the nested list
//        list.add(Arrays.asList(10, 20));
//        list.add(Arrays.asList(11, 21));
//        list.add(Arrays.asList(12, 25));
//        list.add(Arrays.asList(5, 6, 7));

		List<List<Integer>> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the size of " + (i + 1) + " array");
			int arrsize = sc.nextInt();
			int[] arr = new int[arrsize];
			System.out.println("Enter elements of array");
			for (int j = 0; j < arrsize; j++) {
				arr[j] = sc.nextInt();
			}
			List<Integer> templist = new ArrayList<>();
			for (int x : arr) {
				templist.add(x);
			}
			list.add(templist);
		}
		System.out.println(list.toString());

		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < list.size() - 1; i++) {
			List<Integer> first = list.get(i);
			List<Integer> second = list.get(i + 1);
			List<Integer> small = new ArrayList<>();

			for (int f : first) {
				int count = 0;
				for (int s : second) { // 10<11 10<21
					if (f < s) {
						count++;
					}
				}
				if (count == second.size()) { // Add to "small" if f is smaller than all elements in second
					small.add(f);
				}
			}
			result.add(small);
		}
		System.out.println("Output:");
		System.out.println(result);
	}
}
