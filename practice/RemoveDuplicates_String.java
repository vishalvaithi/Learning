package practice;

import java.util.Scanner;

public class RemoveDuplicates_String {
	
	public static String removeDuplicates(String str) {
		String res = "";
		for(int i=0 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			if(res.indexOf(c) == -1) {
				res += c;
			}
		}
		return res;	
	}
	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		String result = removeDuplicates(str);
		System.out.println(result);
		
		str=str.substring(2);
		System.out.println(str);
		
		StringBuilder sb=new StringBuilder("vishal");
		
		
	}
}