package list;
import java.util.Arrays;
public class plusOne {
	public static int[] plusOneWrong(int[] digits) {
        int len=digits.length-1;
        int last=digits[len]+1;
        int temp[];
        if(last%10==0){
            temp=new int[len+2];
            System.arraycopy(digits, 0, temp, 0, len);
            temp[len]=last/10;
            temp[len+1]=0;
        }else{
            temp=new int[len+1];
            System.arraycopy(digits, 0, temp, 0, len);
            temp[len]=last;
        }
        return temp;
    }
	
	public static int[] plusOne(int[] digits) {
		// Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // Add 1 to the current digit
            digits[i]++;
            // If the digit becomes less than 10, no carry, return the result
            if (digits[i] < 10) {
                return digits;
            }
            // If the digit is 10, set it to 0 and carry over
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;  // The most significant digit is now 1
        // All other digits are already 0 by default, so we can return the result
        return result;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,9};
		int[] res=plusOne(arr);
		System.out.println(Arrays.toString(res));
		int[] result=plusOneWrong(arr);
		System.out.println(Arrays.toString(result));
	}

}
