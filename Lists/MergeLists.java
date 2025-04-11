package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {
	
	 public static List<Integer> Merge(List<Integer> list1, List<Integer> list2){
		 
		 List<Integer> link = new ArrayList<Integer>();
		 int i=0,j=0;
		 
		 while(i < list1.size() && j < list2.size()) {
			 if(list1.get(i) < list2.get(j)) {
				 link.add(list1.get(i));
				 i++;
			 }
			 else {
				 link.add(list2.get(j));
				 j++;
			 }
		 }
		 while(i < list1.size()) {
			 link.add(list1.get(i));
			 i++;
		 }
		 while(j < list2.size()) {
			 link.add(list2.get(j));
			 j++;
		 }
		 return link;
	 }
	 public static void main(String[] args) {
		 System.out.println("HI");
		 List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2,7,0,4,6,7,8));
		 List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,4,5,2,7,8));
		 
		 List<Integer> res = Merge(list1,list2);
		 System.out.println(res);
		 
		 
	}

}
