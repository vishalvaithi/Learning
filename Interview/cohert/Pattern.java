package cohert;

public class Pattern {
	
	public static void main(String[] args) {
		
		int rows=5;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(j<i) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
				
			System.out.println();
		}
		
		
}
	}


