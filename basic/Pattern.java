package basic;

public class Pattern {

	public static void main(String[] args) {
	int rows = 6;
	
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=6;j++) {
			if(j>=i) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	System.out.println(); 
	
    for (int i = 1; i <= rows; i++) {
		for(int j = 1 ; j <= i ; j++) {
			System.out.print("* ");
		}
		System.out.println();
	  }
    System.out.println();
    
    for (int i = 1; i <= rows; i++) {
		for(int j = 1 ; j <= rows ; j++) {
			System.out.print("* ");
		}
		System.out.println();
	  }
    System.out.println();
    
    
    for(int i=1;i <= 6;i++) {
    	for(int j=1;j<=6;j++) {
    		if(i==1 || i==6 || j==1 || j==6) {
    			System.out.print("* ");
    		}else {
    			System.out.print("  ");
    		}
    	}
    	System.out.println();
    }
    System.out.println();
    
    for(int i=1;i <= 6;i++) {
    	for(int j=1;j<=6;j++) {
    		if(i==j || i+j==7) {
    			System.out.print("* ");
    		}else {
    			System.out.print("  ");
    		}
    	}
    	System.out.println();
    }
    System.out.println();
    
    
    
    for (int i = rows; i >= 1; i--) {
		for(int j = 1 ; j <= i ; j++) {
			System.out.print("* ");
		}
		System.out.println();
	  }
    System.out.println();
    
    for(int i = 1 ; i <= rows ; i++) {
    	for(int j = 1 ; j <= rows - i ; j++) {
    		System.out.print(" ");
    	}
    	for(int k = 1 ; k <= 2 * i - 1 ; k++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
    //System.out.println();
  
    for(int i = rows ; i >= 1 ; i--)
    {
        for(int j = i ; j < rows ; j++) {
           System.out.print(" ");
        }
        for(int K = 1 ; K <= 2 * i - 1 ; K++) {
           System.out.print("*");
        }
      System.out.println("");
    }
    
    
    }
    }

