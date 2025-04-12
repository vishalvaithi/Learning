package cohert;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		
		String s1 = "10101";
		
		int sum=1,res=0;
		for(int i=s1.length()-1;i>=0;i--) {
			char ch=s1.charAt(i);
			if(ch=='1') {
				res+=sum;
			}
			sum*=2;
		}
		System.out.println(res);
		
		
		System.out.println(Integer.parseInt(s1, 2));
	}

}
