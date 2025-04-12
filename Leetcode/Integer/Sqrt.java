package Integer;

public class Sqrt {
	
	public static void main(String[] args) {
		
		int res=mySqrt(40);
		System.out.println(res);
	}

	private static int mySqrt(int num) {

		if(num<2) {
			return num;
		}
		int left=0,right=num;	
		while(left<=right) {
			int mid=(left+right)/2;
			if(mid*mid >num) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
//		int result=(int) Math.sqrt(8);
		return right;
	}
	public int mySqrt1(int x) {
        int result=(int) Math.sqrt(x);
        return result;
    }

}
