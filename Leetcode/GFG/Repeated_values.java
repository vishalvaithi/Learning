package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Repeated_values {

	public static int[] findDuplicates(int[] arr) {

		Arrays.sort(arr);
		int len = arr.length, temp = 0;
		for (int i = 1; i < len; i++) {
			if (arr[i] == arr[i - 1]) {
				arr[temp++] = arr[i - 1];
			}
		}
		return Arrays.copyOf(arr, temp);
	}

	public List<Integer> findDuplicates1(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		List<Integer> ans = new ArrayList<>();
		for (int i : arr) {

			if (set.contains(i)) {
				ans.add(i);
			} else {
				set.add(i);
			}
		}
		return ans;
	}

	public List<Integer> findDuplicates2(int[] arr) {

		Arrays.sort(arr);
		List<Integer> res = new ArrayList<Integer>();
		int len = arr.length, temp = 0;
		for (int i = 1; i < len; i++) {
			if (arr[i] == arr[i - 1]) {
				res.add(arr[i]);
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int arr[] = { 5, 1, 6, 2, 2, 4, 5, 2 };
		int[] res = findDuplicates(arr);
		System.out.println(Arrays.toString(res));
	}
}
