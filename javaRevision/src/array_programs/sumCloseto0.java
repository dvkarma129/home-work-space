package array_programs;

public class sumCloseto0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, -5, 7, 8, 20, -40, 6 };
		int sum = Math.absExact(arr[0] + arr[1]);

		int f = 0;
		int s = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int k = i + 1; k < arr.length; k++) {
				int tempSum = Math.abs(arr[i] + arr[k]);
				if (tempSum < sum) {
					sum = tempSum;
					f = arr[i];
					s = arr[k];
				}
			}

		}

		System.out.println(f + " " + s);

	}

}
