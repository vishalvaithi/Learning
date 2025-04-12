package GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class modigyArray {

	static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
		int i = 1;
		ArrayList<Integer> a = new ArrayList<>();
		while (i < arr.length) {
			if (arr[i] == arr[i - 1]) {
				a.add(arr[i] + arr[i - 1]);
				i = i + 2;
			} else {
				if (arr[i] == arr[i + 1]) {
					i++;
					continue;
				} else {
					a.add(arr[i - 1]);
					i++;
				}
			}
		}
		for (int j = a.size(); j < arr.length; i++) {
			a.add(0);
		}
		return a;
	}
	 public static int[] sortIt(int arr[]) {//odd and even
	        Arrays.sort(arr);
	        int len=arr.length-1,index=0;
	        int temp[]=new int[len+1];
	        for(int i=len;i>=0;i--){
	            if(arr[i]%2 != 0){
	                temp[index++]=arr[i]; 
	            }else{
	                temp[len--]=arr[i];
	            }
	        }
	        System.out.println(Arrays.toString(temp));
	        for(long j:temp){
	            System.out.print(j+" ");
	        }
	        return temp;
	    }
	
	public static void main(String[] args) {
		int arr[]= {2,2,0,4,0,8,8};
		int arr1[]= {2,1,4,3,6,5,8,7};
		//System.out.println(modifyAndRearrangeArr(arr));
		System.out.println(sortIt(arr1));
	}
}
