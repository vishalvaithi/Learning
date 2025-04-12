package GFG;

public class NumOccurence {

	int countFreq(int[] arr, int target) {
		// code here
		int n = arr.length;
		int count = 0; 
		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				count++;
			}
		}
		return count;
	}
	
    public static String printString(String s, char ch, int count) {
        int temp=0,i;
        for(i=0;i<s.length();i++){
        	if(s.charAt(i)==ch){
                    temp++;
                }
            if(temp==count){
                break;
            }
        }
        if(temp<count) {
        	return "";
        }
        
        return s.substring(i+1);
    }
    
    public static void main(String[] args) {
		System.out.println(printString("aaaaa",'a',2));
	}
}


