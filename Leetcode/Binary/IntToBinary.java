package Binary;
public class IntToBinary {
	
	public static void main(String[] args) {
		convertToBinary(23);
		convertToInt("10111");
		NumOfBit(128);
	}

	private static void NumOfBit(int num) {
		String s="";
		while(num>0) {
			int rem=num%2;
			s=rem+s;
			num=num/2;
		}
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') {
				count++;
			}
		}System.out.println(count);
	}

	private static void convertToInt(String s) {

		int decimal=0,base=1;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='1') {
				decimal+=base;
			}
			base*=2	;
		}System.out.println(decimal);
	}

	private static void convertToBinary(int num) {

		String s="";
		while(num>0) {
			int rem=num%2;
			s=rem+s;
			num/=2;
		}
		System.out.println(s);
	}
}
