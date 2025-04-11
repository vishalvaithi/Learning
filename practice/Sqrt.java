package practice;
import java.util.Scanner;
public class Sqrt {

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left )/ 2;
//          System.out.println(mid);
//          System.out.println(x / mid);
            if (mid == x / mid) {
                return mid;
            } 
            else if (mid > x / mid) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }
        return right;  // The floor of the square root when `left` goes out of bounds
    }
    
    public static void main(String[] args) {
        System.out.println("Enter a num : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int res = mySqrt(num);
        System.out.println("Square root of " + num + " is: " + res);
        int result=(int) Math.sqrt(12); 
        System.out.println(result);
    }
}
