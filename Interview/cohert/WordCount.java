package cohert;

import java.util.Arrays;

public class WordCount {

	public static void main(String[] args) {
		
		String a= "  Once   Upon  a Time";
		String[] arr = a.trim().split("\\s+");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		System.out.println(' '+0);
		
		int count=0;
		boolean isword=false;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
			//if(Character.isLetterOrDigit(a.charAt(i))) {
			
				isword=true;
			}
			else if(isword) {
				count++;
				isword=false;
			}
		}
		if(isword) {
			count++;
		}
		System.out.println(count);
	}
	
}
