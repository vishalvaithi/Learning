package practice;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		
		System.out.println("Enter a year : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if( ( n%4 == 0 && n%100 != 0 ) || n%400 == 0 ) {
			System.out.println("The given year is leap year ");
		}
		else {
			System.out.println("The given year is not leap year");
		}
		s.close();
	}

}
