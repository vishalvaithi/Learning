package SoftSuave;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix_2 {
	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int size = sc.nextInt();
		List<Integer> primes = primeList(size);
		int[][] matrix = new int[size][size];
		int index = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = primes.get(index++);
			}
		}
        //System.out.println(primes.toString());
		int top = 0, bottom = matrix.length - 1, left = 0, right = matrix.length - 1;
		//`System.out.println(top +" "+bottom+" "+left+" "+right);

		while (top <= bottom && left <= right) {
			// Traverse from left to right
			for (int i = left; i <= right; i++) {
				System.out.print(matrix[top][i] + " ");
			}
			top++; // top = 1 2
			// Traverse from top to bottom
			for (int i = top; i <= bottom; i++) {
				System.out.print(matrix[i][right] + " ");
			}
			right--; // right 1 0
			// Traverse from right to left
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--; // 1 0
			}
			// Traverse from bottom to top
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(matrix[i][left] + " ");
				}
				left++; // 1
			}
		}
	}

	public static List<Integer> primeList(int num) {
		List<Integer> list = new ArrayList<Integer>();
		int n = num * num;
		int n1 = 0;
		for (int i = 2; i < Integer.MAX_VALUE && n1 < n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				list.add(i);
				n1++;
			}
		}
		System.out.println(list);
		return list;
	}

}
