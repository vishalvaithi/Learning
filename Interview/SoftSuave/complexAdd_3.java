package SoftSuave;

import java.util.*;

public class complexAdd_3 {
	public static String complexNumberMulƟply(String a, String b) {
		//this line is used to remove + sign in the string to add in array
		//str1 = str1.replace("i", ""); 
        //String[] parts = str1.split("\\+");
		String[] x = a.split("\\+|i"); // Splits "a+bi" into [a, b]
		String[] y = b.split("\\+|i"); // Splits "c+di" into [c, d]
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		int aReal = Integer.parseInt(x[0]);
		int aImag = Integer.parseInt(x[1]);
		int bReal = Integer.parseInt(y[0]);
		int bImag = Integer.parseInt(y[1]);
		int realPart = aReal * bReal - aImag * bImag;
		int imagPart = aReal * bImag + aImag * bReal;
		// Returning the result as a string in the format "real+imagi"
		return realPart + "+" + imagPart + "i";
	}

	public static void main(String[] args) {
		// Example input strings
		String str1 = "2+1i";
		String str2 = "2+1i";
		// CalculaƟng and displaying the result
		String result = complexNumberMulƟply(str1, str2);
		System.out.println("The product of " + str1 + " and " + str2 + " is: " + result);
	}
}
