 package Question;

import java.util.Scanner;

public class CountVowels {
	
public static void Method1(String s) {
		
		s=s.replaceAll("[^a-zA-Z]", "");
		String vowels="aeiouAEIOU";
		String res1="";
		String res2="";
		
		for(int i=0;i<s.length();i++) {
			if(vowels.indexOf(s.charAt(i)) != -1) {
				res1=res1+s.charAt(i);
			}		
	}
		
		for(int i=0;i<s.length();i++) {
			if(vowels.indexOf(s.charAt(i)) == -1) {
				res2=res2+s.charAt(i);
			}
		}
		
		System.out.println("THE VOWELS IN THE STRING : "+res1);
		System.out.println("THE CONSONANTS IN THE STRING : "+res2);
		
		
	}
	
	private static void countvowels(String input) {
		
		String vowels = "aeiou";
		int len = input.length();
		int count =0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<len;j++) {
				if(vowels.charAt(i) == input.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string :");
		Scanner s =new Scanner(System.in);
		String input = s.nextLine();
//		input.replace(" ", "");
		s.close();
		countvowels(input);
		Method1(input);
		
	}

}
