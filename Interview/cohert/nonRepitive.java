package cohert;

import java.util.LinkedHashMap;
import java.util.Map;

public class nonRepitive {
	
	public static void main(String[] args) {
		
		String s="swiss";
		int len=s.length();
		for(int i=0;i<len;i++) {
			char ch=s.charAt(i);
			boolean res=false;
			for(int j=0;j<len;j++) {
				if(i!=j && ch == s.charAt(j)) {
					res=true;
					break;
				}
			}
			if(!res) {
				System.out.println("First non repetive "+ch);
				return;
			}
		}	
	}
	
	public static void find() {

        String s = "swiss";
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // First pass: count frequency of each character
        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Second pass: find first character with count 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repetitive character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repetitive character found.");
    }
	
}
