package array_programs;

public class missingElmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length + 1;

		int sum = n * (n + 1) / 2;
		int newSum = 0;
		for (int i = 0; i < arr.length; i++) {
			newSum = newSum + arr[i];
		}
	
		int res = sum - newSum;
		System.out.println(res);
	}

}
