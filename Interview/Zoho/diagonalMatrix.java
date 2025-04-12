package Zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class diagonalMatrix {
	
	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		diagonal2(arr);
		diagonal1(arr);
		
		
	}
	static void diagonal1(int arr[][]) {
		
		int m=arr.length;
		int n=arr[0].length;
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<m+n-1;i++) {//loop run 5 times becz zigzag
			
			List<Integer> temp=new ArrayList<>();
			int row=(i<m)?0:i-m+1;
			System.out.println(row);
			int col=(i<m)?i:m-1;
			System.out.println(col);

			while(row<n && col>=0) {
				temp.add(arr[row++][col--]);
			}
			
			if(i%2==0) {
				for(int j=temp.size()-1;j>=0;j--) {
					list.add(temp.get(j));
				}
			}else {
				list.addAll(temp);
			}
		}
		
		 System.out.println(list);
	}
	
	
	static void diagonal2(int arr[][]) {
		
		 int join[]=new int[9];
		 int m=3,n=3,i,j,temp=0;

		 for(int k=0;k<m;k++) {
			 i=k;
			 j=0;
			 while(i>=0) {
				 join[temp++]=arr[i][j];
				 i=i-1;
				 j=j+1;
			 }
		 }

		 for(int k=1;k<n;k++) {
			 i=m-1;
			 j=k;
			 while(j<n) {
				 join[temp++]=arr[i][j];
				 i=i-1;
				 j=j+1;
			 }
		 }
		 
		 System.out.println(Arrays.toString(join));
		
	}

}
