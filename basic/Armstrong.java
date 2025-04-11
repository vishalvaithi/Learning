 package basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int originalNumber = n; // Store the original number
		int arm = 0;

		while(n > 0) {
			int rem = n % 10;
			arm += rem * rem * rem; // Correct the arm calculation
			n = n / 10;
		}

		if (arm == originalNumber) {
			System.out.println("The number is an Armstrong number.");
		} else {
			System.out.println("The number is not an Armstrong number.");
		}
	}
}
