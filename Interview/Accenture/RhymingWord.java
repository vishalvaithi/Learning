package Accenture;
public class RhymingWord {
    public static String findRhyme(String S, String[] D, int length) {
        String bestRhyme = "No Word";
        int maxMatchLength = 0;

        for (int i = 0; i < length; i++) {
            String word = D[i];
            if (!word.equals(S)) {
                int matchLength = getMatchingSuffixLength(S, word);
                if (matchLength > maxMatchLength) {
                    maxMatchLength = matchLength;
                    bestRhyme = word;
                }
            }
        }
        return bestRhyme;
    }

    public static int getMatchingSuffixLength(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        int matchLength = 0;
        for (int i = 1; i <= minLength; i++) {
            if (word1.charAt(word1.length() - i) == word2.charAt(word2.length() - i)) {
                matchLength++;
            } else {
                break;
            }
        }
        return matchLength;
    }

    public static void main(String[] args) {
        String S1 = "thunder";
        String[] D1 = {"puzzle", "thunder", "powder", "blender", "under"};
        int length1 = 5;
        System.out.println(findRhyme(S1, D1, length1));

        String S2 = "pole";
        String[] D2 = {"kilo", "super", "cake"};
        int length2 = 3;
        System.out.println(findRhyme(S2, D2, length2));
    }
}