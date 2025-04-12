package list;
import java.util.Arrays;
public class twoMergeList {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,3};
		int b[]= {2,3,4,5};
		int[] res=mergeTwoLists(a,b);
		System.out.println(Arrays.toString(res));
	}

	public static int[] mergeTwoLists(int[] list1, int[] list2) {
		int[] join = new int[list1.length + list2.length];
		int i = 0, j = 0, k = 0;
		while (i < list1.length && j < list2.length) {
			if (list1[i] < list2[j]) {
				join[k++] = list1[i++];
			} else {
				join[k++] = list2[j++];
			}
		}
		while (i < list1.length) {
			join[k++] = list1[i++];
		}
		while (j < list1.length) {
			join[k++] = list2[j++];
		}
		return join;
	}
}

