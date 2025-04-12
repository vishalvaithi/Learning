package String;

import java.util.Arrays;

public class lcp {
	public static String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
        String res="";
        String first = strs[0];
        String sec= strs[strs.length-1];
        for(int j=0;j<first.length();j++){
            if(first.charAt(j) == sec.charAt(j)){
                res=res+first.charAt(j);
            }
            else{
                break;
            }
        }
        return res;
	}
	
	private String second(String[] v) {
		StringBuilder ans = new StringBuilder();
		Arrays.sort(v);
		String first = v[0];
		String last = v[v.length - 1];
		for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
			if (first.charAt(i) != last.charAt(i)) {
				return ans.toString();
			}
			ans.append(first.charAt(i));
		}
		return ans.toString();
	}

	public static String longestCommonPrefix3(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
	
	public static void main(String[] args) {
		
		String[] arr= {"flower","flow","flight"};
		String res=longestCommonPrefix3(arr);
		System.out.println(res);
	}
}


