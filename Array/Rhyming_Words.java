package Array;
public class Rhyming_Words {
	public static void main(String[] args) {
		String s="pole";
		String[] arr= {"kilo","super","cake"};
		int length=arr.length;
		System.out.println(checkRymingWords(s,arr,length));		
		String S1 = "thunder";
        String[] D1 = {"puzzle", "thunder", "powder", "blender", "under"};
        int length1 = 5;
        System.out.println(checkRymingWords(S1, D1, length1));
	}

	private static String checkRymingWords(String s, String[] arr, int length) {
		String word="No Word";
		int match=0;
		for(int i=0;i<length;i++) {	
			String first=arr[i];
			if(!s.equals(first)) {
				int maxLength=checkWord(s,first);
				if(match<maxLength) {
					match=maxLength;
					word=first;
				}
			}
		}
		return word;
	}

	private static int checkWord(String word, String first) {
		int count = 0;
		int minLength=Math.min(word.length(),first.length());
		for(int i=1;i<=minLength;i++) {
			if(word.charAt(word.length()-i) == first.charAt(first.length()-i)) {
				count++;
			}else {
				break;
			}
		}
		return count;
	}
}
