package SoftSuave;

import java.util.Scanner;

public class Prime_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		String numbers = sc.nextLine(); // 2 90 100
		String[] array = numbers.split(" "); 
		int start = Integer.parseInt(array[0]);
		int end = Integer.parseInt(array[1]);
		int limit = Integer.parseInt(array[2]);
		
		int n1 = 0, n2=1, n3=0; int sum=0;
		while(n3<end) //0 1
		{
			n3=n1+n2; //1 
			n1=n2;    //1 
			n2=n3;    //1
			System.out.println(n3);
			if(isPrime(n3))    
			{
				if(n3>=start)  // 1>=2
				{
					sum+=n3;
					System.out.println("sum = "+sum);
				}
			}
		}
		System.out.println(sum);
		if(sum>limit)
			System.out.println("yes");
		else
			System.out.println("No");
	}
	public static boolean isPrime(int num){
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0)
				count++;
		}
		if(count<=2) 
			return true;
		else
			return false;
	}
}
