package questionPaper;

import java.util.HashMap;
import java.util.Map;

public class countFrequency {
	
	public static void main(String[] args) {
		
		String s="programming";
		Map<Character, Integer>map=new HashMap();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)) {
				int value=map.get(c);
				value++;
				map.put(c, value);
			}else {
				map.put(c,1);
			}
		}
		
		System.out.println(map);
	}
}
