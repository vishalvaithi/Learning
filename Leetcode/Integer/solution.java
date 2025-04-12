package Integer;

public class solution {
	public static boolean isPalindrome(int x) {
        int copy=x,rem=0,rev=0;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(copy==rev){
            return true;
        }

    return false;
    }
	public static void main(String[] args) {
		
		boolean res=isPalindrome(121);
		System.out.println(res);
	}
	
	
}
