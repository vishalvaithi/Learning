package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Indices_of_twoInt {

	public static int[] findtwovalues(int num[],int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i < num.length ; i++) {
			int complement = target - num[i];
			System.out.println(map.containsKey(complement));
			if(map.containsKey(complement)) {
//				return new int[] {map.get(complement),i};
				return new int[] {complement , num[i]};
			}
			map.put(num[i], i);
		}
		return null;
	}
	public static void main(String[] args) {
		
		int[] num = {2,3,4,1,8,6,5,9,7};
		System.out.println("Enter a target value : ");
		Scanner s = new Scanner(System.in);
		int target = s.nextInt();
		s.close();
		int[] result = findtwovalues(num,target);		
		if (result != null) {
            System.out.println("Values: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
	}
}
