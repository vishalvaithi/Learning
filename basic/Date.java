package basic;

import java.util.Scanner;

public class Date {
	
	public static void findday(int date,int mon,int year,int arr[]) {
		int Original = 1900;
		int year1 = (year-Original)%7;
		int year2 = (year-Original)/4;
		int y = (year1+year2+date) % 7;
		mon =  arr[mon-1];
		
		y=(y+mon)%7;
		if(year%4==0)
			if(mon<=2)
				y -= 1;
		//Method one		
		if(y==1)
			System.out.println("Sunday");
		else if(y==2)
			System.out.println("Monday");
		else if(y==3)
			System.out.println("Tuesday");
		else if(y==4)
			System.out.println("Wednesday");
		else if(y==5)
			System.out.println("Thursday");
		else if(y==6)
			System.out.println("Friday");
		else
			System.out.println("Saturday");
		
		//Method Two
		String days[] = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		System.out.println(days[y]);
	}

	public static void main(String[] args) {
		
		int arr[] = {1,4,4,0,2,5,0,3,6,1,4,6};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the date :");
		int date = s.nextInt();
		System.out.println("Enter the month :");
		int mon = s.nextInt();
		System.out.println("Enter the Year :");
		int year = s.nextInt();
		s.close();		
		findday(date,mon,year,arr);
	}
	
	
	
}
