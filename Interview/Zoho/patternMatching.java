package Zoho;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class patternMatching {
	
	public static void main(String[] args) {
		
		String[] arr= {"abc","mno","aab","azy"};
		String pattern="xyz";
		
		for(String word:arr) {
			if(matching(word,pattern)) {
				System.out.print(word+" ");
			}
		}
	}

    private static boolean matching(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        
        Map<Character, Character> charMap = new HashMap<>();
        Set<Character> usedChars = new HashSet<>();
        
        for (int i = 0; i < word.length(); i++) {
            char wChar = word.charAt(i);
            char pChar = pattern.charAt(i);
            
            if (charMap.containsKey(pChar)) {
                if (charMap.get(pChar) != wChar) {
                    return false;
                }
            } else {
                if (usedChars.contains(wChar)) {
                    return false;
                }
                charMap.put(pChar, wChar);
                usedChars.add(wChar);
            }
        }        
        return true;
    }
}