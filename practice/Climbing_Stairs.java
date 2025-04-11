package practice;
import java.util.Scanner;

public class Climbing_Stairs {

	public static void main(String[] args) {
		
		System.out.println("How many stairs to climb : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		
		if(num <= 2) {
			System.out.println("The" + num + "distinct ways to climb on the top");
		}
		else {
			int temp1 = 1, temp2 = 2;
			for(int i = 3 ; i <= num ; i++) {
				int current = temp1 + temp2;
				temp1= temp2;
				temp2 = current;
			}
			System.out.println("The " + temp2 + " distinct ways to climb on the top");
		}
	}
}