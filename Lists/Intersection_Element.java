package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection_Element {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,5,6,7,9));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(2,3,3,4,6,7,1));
		System.out.println("The list1 : "+list1);
		System.out.println("The list2 : "+list2);

		List<Integer> res = intersection(list1,list2);
		System.out.println(res);
	
	}

	public static List<Integer> intersection(List<Integer> list1,List<Integer> list2){
		
		Set<Integer> s1 = new HashSet<Integer>(list1);
		Set<Integer> s2 = new HashSet<Integer>(list2);
		s1.retainAll(s2);  
		System.out.println(s1);
		System.out.println("The set : "+s2);
		return new ArrayList<>(s1);
		
	}
}
