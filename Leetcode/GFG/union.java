package GFG;

import java.util.HashSet;
import java.util.Set;

public class union {

	public static int findUnion(int a[], int b[]) {

		Set<Integer> join=new HashSet<Integer>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                join.add(a[i++]);
            }else{
                join.add(b[j++]);
            }
        }
        while(i<a.length){
            join.add(a[i++]);
        }
        while(j<b.length){
            join.add(b[j++]);
        }
       
        int res=join.size();
        return res;
	}

	public static void main(String[] args) {

		int a[]= {1,2,3};
		int b[]= {1,2,3};
		int res=findUnion(a,b);
		System.out.println(res);
		}
}
