package GFG;

import java.util.ArrayList;
import java.util.Collections;

public class FromLargestNum {

	static String findLargest(int[] arr) {
        ArrayList<String> s = new ArrayList<>();
        for (int i : arr) {
            s.add(Integer.toString(i));
        }
        Collections.sort(s, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(str);
        }
        if (s.get(0).equals("0")) {
            return "0";
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		
		int[] arr= {3,2,1,4,5};
		System.out.println(findLargest(arr));
		
	}
}
