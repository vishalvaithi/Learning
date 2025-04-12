package SoftSuave;

import java.util.Scanner;

public class KeyboardFor_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 digit Number 0-9");
		String num = sc.next();
		if (num.matches("[0-9]{10}")) {

			System.out.println("Enter the number");
			String digit = sc.next();
			int target = 0;
			int current = 0;
			int total = 0;
			for (int i = 0; i < digit.length(); i++) // 210
			{
				for (int j = 0; j < num.length(); j++) // 0123456789
				{
					target = j; // 2 //1 //0
					if(num.charAt(j) == digit.charAt(i)) {
						total += Math.abs(target - current); // 2 //1-2=1 //0-1=1
						current = target; // 2 //1
						break;
					}
				}
			}
			System.out.println("Total time is: " + total);
		} else {
			System.out.println("Invalid");
		}
	}
}