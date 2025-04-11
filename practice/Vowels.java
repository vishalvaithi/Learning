package practice;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		System.out.println("Enter a string : ");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		s.close();
		String str = st.replaceAll("[^a-zA-Z]", "").toLowerCase();
		int vcount = 0,ccount = 0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vcount++;
			}else {
				ccount++;
			}
		}
		System.out.println("The vowels count in string are : " + vcount);
		System.out.println("The consonants count in string are : " + ccount);
		System.out.println("The total count in string are : " + str.length());
		
	}
}