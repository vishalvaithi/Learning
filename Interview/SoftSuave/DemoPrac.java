package SoftSuave;

public class DemoPrac {
public static void stringReplace(String str) {
	str=str.replace('j','c');
}
public static void stringBufferReplace(StringBuffer str) {
	str=str.append("c");
}

	public static void main(String args[]) {
	String str= new String("java");
	StringBuffer st= new StringBuffer("java");
	stringBufferReplace(st);
	stringReplace(str);
	System.out.println(str+st);
}
}
