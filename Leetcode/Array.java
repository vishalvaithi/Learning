import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 8 };
		int[] res = uniqueValues(arr);
		System.out.println(Arrays.toString(res));
		int[] res1 = repeatedValues(arr);
		System.out.println(Arrays.toString(res1));
		findRepeated(arr);
	}
	
	public static void findRepeated(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }if (isRepeated) {
                System.out.print(arr[i] + " ");
            }
        }
    }

	private static int[] repeatedValues(int[] arr) {
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int k = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] ==arr[i-1]) {
				temp[k++]=arr[i-1];
			}
		}
		return Arrays.copyOf(temp, k);
	}

	private static int[] uniqueValues(int[] arr) {
		if (arr.length == 0)
			return new int[0];

		int[] temp = new int[arr.length];
		int k = 0;
		temp[k++] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				temp[k++] = arr[i];
			}
		}
//	    return temp;
		int[] res = new int[k];
		System.arraycopy(temp, 0, res, 0, k);
		return res;
	}
}
