package awdiz;

public class missingElmnt {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6 };
		int n = arr.length + 1;
		int res = n * (n + 1) / 2;

		int arrSum = 0;
	
		for (int i = 0; i < arr.length; i++) {
			arrSum = arrSum + arr[i];
		}
		System.out.println(res-arrSum);
	}
}
