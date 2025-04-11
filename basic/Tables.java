package basic;

import java.util.Scanner;

public class Tables {
	
	public static void func(long a) {
		for(int i=1;i<=16;i++) {
			long m = a*i;
			System.out.println(a +" * "+ i +" = " + m);
				
		}
	}

	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter a table num :");
		Scanner s = new Scanner(System.in);
		long n = s.nextInt();
		s.close();
		/*Tables t = new Tables();
		for(int j=1;j<=n;j++) {
			t.func(j);
		}*/
		func(n);
		
	}

}
}