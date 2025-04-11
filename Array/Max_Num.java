package Array;

public class Max_Num {

	public static void sec(int nums[]) {
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		System.out.println(fmax);
		for(int num : nums) {
			if(fmax < num ) {
				smax = fmax;
				fmax = num;
			} 
			else if(fmax > num && smax < num) {
				smax = num;
			}
		}
		if(smax == Integer.MIN_VALUE) {
			System.out.println("The second max is not exist");
		}
		else {
			System.out.println("The second max num is : "+ smax);
		}	
}

	public static void third(int nums[]) {
		
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		int tmax = Integer.MIN_VALUE;
		
		for(int num : nums) {
			if(num > fmax) {
				tmax = smax;
				smax = fmax;
				fmax = num;
			}
			else if(fmax > num && smax < num) {
				tmax = smax;
				smax = num;
			}
			else if(smax > num && tmax < num) {
				 tmax = num;
			}
		}
		System.out.println("The first max value : " + fmax);
		System.out.println("The second max value : " + smax);
		System.out.println("The third max value : " + tmax);
		/*if(tmax == Integer.MIN_VALUE) {
			System.out.println("The the value doesn't exist ");
		}
		else {
		System.out.println("The third max value :"+tmax);
	}	
	*/
}
	
	public static void main(String[] args) {
		int nums[] = {2,8,9,5,7,6};
		sec(nums);
		third(nums);
	}

}
 