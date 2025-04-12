public class problem {
	
	public static void main(String[] args) {
		
		String s= "1sfe3&%3jJ&^56";
		check(s);
		
	}

	private static void check(String s) {
//0 - 48,9 - 57,a - 97,z - 122,A - 65,Z - 90
		char c='Z';
		int res =c;
		System.out.println(res);
		s=s.toLowerCase();
		String s1="";
		int temp=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch > 97 && ch < 122) {	
				continue;
			}else {
				s1=s1+ch;
			}
		}
		s="";
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(ch > 48 && ch < 57) {	
				temp=temp+(ch-48);
			}else {
				s=s+ch;
			}
		}
		String b="";
		for(int i=1;i<=s.length();i++) {
			char r = s.charAt(s.length()-i);
			b += r;
		}
		b=b+temp;
		System.out.println(b);
		
	}

}
