package list;

public class removeElement {
	public static int removeElement1(int[] nums, int val) {
        int[] res = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                res[k++]=nums[i];
            }
        }
        return k;
    }
	
	public static void main(String[] args) {
		
		int arr[] = {3,2,2,3};
		int res=removeElement1(arr,3);
		System.out.println(res);
	}

}
