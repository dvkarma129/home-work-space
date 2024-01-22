package array_programs;

public class sumCloseToX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 3;
		int[] arr = { -40, -5, 1, 3, 6, 7, 8, 20 };

		int f = 0, s = 0;
		int min = Math.abs(arr[0] + arr[1] - x);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tempMin = Math.abs(arr[i] + arr[j] - x);
				if (tempMin < min) {
					f = arr[i];
					s = arr[j];
					min = tempMin;
				}
			}

		}

		System.out.println(f + " " + s);
	}

}
