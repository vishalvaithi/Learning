package cohert;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		int a=21;
		System.out.println(Integer.toBinaryString(a));

		String s1="";
		while(a>0) {
			int rem=a%2;
			s1=rem+s1;
			a=a/2;
		}
		System.out.println(s1);
		
		
	}

}
