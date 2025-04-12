package cohert;

public class addBinary {
	
	public static void main(String[] args) {
		
		String s1="10101";
		String s2="1";
		
		int num1=Integer.parseInt(s1,2);
		int num2=Integer.parseInt(s2,2);
		int sum=num1+num2;
		System.out.println(Integer.toBinaryString(sum));
		
		
		StringBuilder sb=new StringBuilder();
		int l1=s1.length()-1;
		int l2=s2.length()-1;
		int carry=0;
		
		while(l1>=0||l2>=0||carry==1) {
			if(l1>=0){
				carry+=s1.charAt(l1--) - '0';
			}
			if(l2>=0) {
				carry+=s2.charAt(l2--) -'0';
			}
			sb.append(carry%2);
			carry/=2;
		}
		
		System.out.println(sb.reverse().toString());
		
	}

}
