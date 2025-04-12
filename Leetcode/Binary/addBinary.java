package Binary;

public class addBinary {
	public static String addBinary1(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0 || carry==1){//carry =1 is add the frst digit
            if(i>=0){
            	//this line convert the char into int using ASCII value
                carry=carry+a.charAt(i--) - '0';
            }
            if(j>=0){
                carry=carry+b.charAt(j--) - '0';
            }
            sb.append(carry%2);
            carry=carry/2;
        }
        return sb.reverse().toString();
    }
	
	public static void main(String[] args) {
		
		String res=addBinary1("11","1");
		System.out.println(res);
		
		int result=(int) Math.sqrt(0);
		System.out.println(result);
		
		int r='1'-'0';
		System.out.println(r);
	}

}
