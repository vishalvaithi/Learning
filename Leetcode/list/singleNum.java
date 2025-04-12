package list;

import java.util.Arrays;

public class singleNum {
	public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
            System.out.println(result);
        }
        return result;
    }
	
	 public int singleNumber1(int[] nums) {
	        // int xor=0;
	        // for(int num:nums)
	        //     xor^=num;
	        // return xor;

	        Arrays.sort(nums);
	        for(int i=1;i<nums.length;i+=2){
	            if(nums[i]!=nums[i-1])
	                return nums[i-1];
	        }
	        return nums[nums.length-1];
	    }
	public static void main(String[] args) {
		
		int arr[]= {4,2,1,2,1};
		int res=singleNumber(arr);
		System.out.println(res);
	}

}
