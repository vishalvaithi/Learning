package GFG;
import java.util.HashSet;

class Anagram {
    public boolean canBePangram(String str, int k) {
        // Create a set to store unique characters
        HashSet<Character> uniqueChars = new HashSet<>();
        
        // Add each character to the set
        for (char ch : str.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                uniqueChars.add(ch);
            }
        }
        
        // Calculate the number of missing characters to make it a pangram
        int missingChars = 26 - uniqueChars.size();
        
        // Check if the number of operations needed is within the allowed limit
        return missingChars <= k && uniqueChars.size() + k >= 26;
    }

    public static void main(String[] args) {
        Anagram sol = new Anagram();
        String str1 = "the quick brown fox jumps over the lazy dog";
        int k1 = 0;
        System.out.println(sol.canBePangram(str1, k1)); // Output: true

        String str2 = "aaaaaaaaaaaaaaaaaaaaaaaaaa";
        int k2 = 25;
        System.out.println(sol.canBePangram(str2, k2)); // Output: true

        String str3 = "a b c d e f g h i j k l m";
        int k3 = 20;
        System.out.println(sol.canBePangram(str3, k3)); // Output: false
    }
}
