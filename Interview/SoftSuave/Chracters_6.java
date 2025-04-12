package SoftSuave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Chracters_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine(); //The article of the arctic was arresting
		System.out.println("Enter String to be searched");
		String search = sc.nextLine();
		String[] arr = s.split(" "); 
		System.out.println(Arrays.toString(arr));
		for(String x:arr){
			if(Charcters(x,search))
				System.out.println(x);
		}
	}
    public static boolean Charcters (String word,String search)
    {
    	boolean status = false;         
    	
    	List<Character> WordList = new ArrayList<Character>();
    	for(char x:word.toCharArray())
    	{
    		WordList.add(x);
    	}
    	
    	List<Character> searchList = new ArrayList<Character>();
    	for(char x:search.toCharArray())
    	{
    		searchList.add(x);
    	}
    	if(WordList.containsAll(searchList))
    		status = true;
//    	System.out.println(WordList);
//    	System.out.println(searchList);
    	return status;
    }
}
