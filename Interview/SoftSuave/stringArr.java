package SoftSuave;

public class stringArr {
	
	public static void main(String[] args) {
		
		String[] arr1= {"alex","alexander","jhon","jhonnson"};
		String[] arr2= {"al","j"};
		find(arr1,arr2);
		
	}

	private static void find(String[] arr1, String[] arr2) {

		for(int i=0;i<arr2.length;i++) {
			String first=arr2[i];
			int count=0;
			for(int j=0;j<arr1.length;j++) {
				String sec=arr1[j];
				if(sec.length()!=first.length()) {
					if(sec.startsWith(first)) {
						count++;
					}
				}
				
			}
			System.out.println(first+"-"+count);
		}
		
	}

}
