package cohert;

public class stringReverse {
	
	public static void main(String[] args) {
		
		String s1="Vishal",s2="";
		for(int i=0;i<s1.length();i++) {
			s2=s1.charAt(i)+s2;
		}
		System.out.println(s2);
		
		s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		

		
		
	}

}
