package Zoho;

public class firstRound {
	
	public static void main(String[] args) {
		
		int a=5;
		int res=++a + ++a + a--;
		System.out.println(res);
		
		System.out.println(func(9));
		
		
	}

	private static int func(int i) {
		
		if(i==0) {
			return 0;
		}
		return 1 + func(i-1);		
	}

}
