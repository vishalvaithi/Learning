package SoftSuave;

public class problem_8 {
	
	public static void main(String[] args) {
		
		String s="Have a nice day";
		method(s);
	}

	private static void method(String s) {
		
		s=s.replaceAll("[^A-Za-z]", "").toLowerCase();
		int len=s.length();
		int rows=(int) Math.sqrt(len);
		int column=rows+1;
		if(rows*column < len) {
			rows++;
		}
		char arr[][] =new char[rows][column];
		int temp=0;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				char c = s.charAt(temp++);
				if(temp<=len)					
				{
					arr[i][j] = c;
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
//		System.out.println(temp);
		for(int i=0;i<column;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(arr[j][i]);
			}
			System.out.print(" ");
		}
		
	}
}