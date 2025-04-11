package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static boolean anagrams(String s1,String s2) {
		s1 = s1.replaceAll("[^a-zA-z]", "").toLowerCase();
		s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] arr1 = s1.toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr2);
		
		for(int i=0;i<s1.length();i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a first sentence : ");
		String s1 = s.nextLine();
		System.out.println("Enter a second sentence : ");
		String s2 = s.nextLine();
		s.close();
		if(anagrams(s1,s2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}
}
