package SortingMethods;

public class Practice {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 7, 9, 12, 15 };
		int target = 7;

		int l = 0;
		int r = arr.length - 1;
		int res = -1;

		while (l <= r) {

			int m = l + (r - l) / 2;

			if (arr[m] == target) {
				res = m;
			} else if (arr[m] < target) {
				l = m+1;
			} else {
				r = m -1;
			}
		}

		if (res!=-1) {
			System.out.println("found at index" + res);
		} else {
			System.out.println("not found");
		}
	}
}
