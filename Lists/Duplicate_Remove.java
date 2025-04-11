package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_Remove {

	public static List<Integer> duplicate(List<Integer> list){
		
		List<Integer> res = new ArrayList<Integer>();
		res.add(list.get(0));
		for(int i=1;i<list.size();i++) {
			if(list.get(i) != list.get(i - 1)) {
				res.add(list.get(i));
			}
		}
		return res;
	}
	public static void main(String[] args) {
		//method 1
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,2,4,5,3,5,4,6,7,5,6,7,3));
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(set);
		System.out.println("The duplicate remove list : "+list);
		
		//method 2
		Collections.sort(list);
		System.out.println("The sorted list :" +list);
		List<Integer> result = duplicate(list);
		System.out.println(result);
	}
}
