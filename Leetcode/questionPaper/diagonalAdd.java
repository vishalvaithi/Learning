package questionPaper;

public class diagonalAdd {

	public static void main(String[] args) {
		
		int arr[][]= {{5,3,-1},{6,9,-5},{-6,5,9}};
		System.out.println(diagonalAddition(arr));
	}

	private static int diagonalAddition(int[][] arr) {

		int temp1=0,temp2=0;
		for(int i=0;i<arr.length;i++) {
			temp1=temp1+arr[i][i]; 
			temp2=temp2+arr[i][arr.length-1-i];
		}
		return Math.abs(temp1-temp2);
	}
	
	
	
}
