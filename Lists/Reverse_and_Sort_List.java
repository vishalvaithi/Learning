package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_and_Sort_List {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,4,3,2);
		List<Integer> reversed = list1.reversed();
		System.out.println("The first list1 is reversed : " + reversed);
		Collections.sort(list1);
		System.out.println("The sorted list 1 : "+list1);
		
		List<String> list2 = List.of("vishal","vaithi","Sutha");
		List<String> reversed2 = list2.reversed();
		System.out.println("The first list2 is reversed : " +reversed2);
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,4,3,2));
		Collections.reverse(list3);
		System.out.println("The first list3 is reversed : " +list3);
		
	}

}