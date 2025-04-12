package Integer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman_Int {
public static int romantoint(String string) {
		
		String str = string.toUpperCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		int temp = 0;
		
		for(int i=str.length()-1 ; i >=0 ; i--) {
			
			int currentvalue = map.get(str.charAt(i));
			if(currentvalue < temp) {
				result = result - currentvalue;
			}else {
				result = result + currentvalue;
			}
			temp = currentvalue;
		}
	    return result;
	}
public static int romantoint2(String string) {
		
		String str = string.toUpperCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		
		for(int i=0 ; i<str.length()-1;i++) {
			int currentvalue = map.get(str.charAt(i));
			if(currentvalue < map.get(str.charAt(i+1))) {
				result = result - currentvalue;
			}else {
				result = result + currentvalue;
			}
		}
		result = result+map.get(str.charAt(str.length()-1));
	    return result;
	}
	public static void main(String[] args) {
		System.out.println("Enter a roman letter to find a integer values : ");
		Scanner s =  new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		int res = romantoint2(str);
		System.out.println("The values is : "+res);
	}
}
