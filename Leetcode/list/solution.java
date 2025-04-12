package list;

import java.util.Arrays;

public class solution {
public static int[] twoSum(int[] nums, int target) {
        
	 int len=nums.length;
     for(int i=0;i<len;i++){
         for(int j=i+1;j<len;j++){
             if(nums[i]+nums[j] == target){
                 return new int[] {i,j};
             }
         }
     }
     return new int[] {};

    }

    public static void main(String args[]){
        int[] nums = {2,3,4,5,6};
        int target = 7;
        int[] res = twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }

}
