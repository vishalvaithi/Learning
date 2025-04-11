package Array;
import java.util.Arrays;

public class DuplicateArray {

    public static void main(String[] args) {
        int b[] = { 2, 2,2,2,2 };
        int[] res = removeDuplicates1(b);
        System.out.println(Arrays.toString(res));
    }
    
    private static int[] removeDuplicates1(int[] b) {
        
    	int j=1;
    	for(int i=1;i<b.length;i++) {
    		if(b[i] != b[i-1]) {
    			b[j++]=b[i];
    		}
    	}
    		
        return Arrays.copyOf(b, j);
//        int[] res = new int[j];
//        System.arraycopy(b, 0, res, 0, j);
//        return res;
    }

    private static int[] removeDuplicates(int[] b) {
        if (b.length == 0) return new int[0];

        int[] temp = new int[b.length];
        int k = 0;
        temp[k++] = b[0];

        for (int i = 1; i < b.length; i++) {
            if (b[i] != b[i - 1]) {
                temp[k++] = b[i];
            }
        }
        System.out.println(k);
//        return temp;
        int[] res = new int[k];
        System.arraycopy(temp, 0, res, 0, k);
        return res;
    }
}
