package array_programs;

public class roatateArray {

	public static void main(String[] args) {
		
		
		String s  ="abcdefghijklmnopqrstuvwxyz";
		char [] arr = s.toCharArray();
		
		int k = 5;
		
		for (int i = 0; i < k; i++) {
			int j;
			char f = arr[0];
			for (j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = f;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
