package String;

public class indexFirstOccurence {

	public static  int strStr(String haystack, String needle) {
        int res=haystack.indexOf(needle);
        if(res==-1){
            return -1;
        }
        return res;
    }
	
	public static void main(String[] args) {
		
		int res=strStr("hello","ll");
		System.out.println(res);
		
		int len=lengthOfLastWord("hi vishal   ");
		System.out.println(len);
	}


	private static int lengthOfLastWord(String s) {
		
		s=s.trim();
		int count=0;
        for(int i=s.length()-1;i>=0;i--){
        	char c=s.charAt(i);
            if(c==' '){
                break;
            }else{
                count++;
            }
        }
        return count;	
	}
}
