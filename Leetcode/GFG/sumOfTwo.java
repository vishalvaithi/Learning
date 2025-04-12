package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class sumOfTwo {
	
	static int check(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp=temp*10+arr[i];
        }
        System.out.println(temp);
        return temp;
    }
    
    static ArrayList<Long> findSum(int arr1[], int arr2[]) {
    	 ArrayList<Long> a = new ArrayList<>();
         long temp=check(arr1)+check(arr2);
         while(temp>0){
             a.add(temp%10);
             temp=temp/10;
         }
         Collections.reverse(a);
         ArrayList<Long> res=a;
         return res;
    
    }
    
    public static int[] common_digits(int[] nums)
    {
        HashSet<Integer> s=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            while(temp>0){
                int rem=temp%10;
                s.add(rem);
                temp/=10;
            }
        }
        int index=0;
        int arr[]=new int[s.size()];
        for(int o:s) {
        	arr[index]=o;
        	System.out.println(arr[index]);
        	index++;
        }
        
        return arr;
    }
    public static void main(String[] args) {
		
    	int[] arr1= {61,4,4,8,5,8,3,6};
    	int[] arr2= {4};
    	System.out.println(findSum(arr1,arr2));
    	int res[]=common_digits(arr1);
    	System.out.println(Arrays.toString(res));
    	System.out.println(isTwistedPrime(97));
    	
	}
    static boolean check(int n){
        if(n<2){
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    static int isTwistedPrime(int n) {
        int count=0;
        if(check(n)){
            System.out.println("hi");
            count++;
        }else{
            return 0;
        }
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
        if(check(sum)){
            return 1;
        }
        return 0;
    }

}
