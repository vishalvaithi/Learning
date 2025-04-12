package cohert;

import java.util.Arrays;
import java.util.HashSet;

public class missingNum {

	public static void main(String[] args) {

		int[] arr = { -1, 1, 3, 4, 2, 6, 5, 9 };
		Arrays.sort(arr);
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int temp = arr[i];
			if (temp > 0) {
				if (arr[i + 1] - temp != 1) {
					int res = ++temp;
					System.out.println("Missing value in array :" + res);
					return;
				}
			}
		}

		int[] arr1 = { -1, 1, 3, 4, 2, 6, 5, 9 };
		Arrays.sort(arr);
		int len1 = arr.length;

		// Start from the smallest positive number
		int expected = 1;

		for (int i = 0; i < len1; i++) {
			if (arr1[i] > 0) {
				if (arr1[i] == expected) {
					expected++;
				} else if (arr1[i] > expected) {
					// Missing number found
					System.out.println("Missing value in array: " + expected);
					return;
				}
			}
		}

		// If all values are consecutive
		System.out.println("Missing value in array: " + expected);
	}

	public static void find() {

		int[] arr = { -1, 1, 3, 4, 2, 6, 5, 9 };
		HashSet<Integer> set = new HashSet<>();

		// Add all positive numbers to the set
		for (int num : arr) {
			if (num > 0) {
				set.add(num);
			}
		}

		// Check for the first missing positive number
		int missing = 1;
		while (true) {
			if (!set.contains(missing)) {
				System.out.println("Missing value in array: " + missing);
				break;
			}
			missing++;
		}
	}
}
