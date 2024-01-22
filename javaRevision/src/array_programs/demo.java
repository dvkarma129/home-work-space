package array_programs;

public class demo {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int target = 1;
		int first = -1;
		int last = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				if (first == -1) {
					first = i;
				}
				last = i;
			}
		}

		System.out.println(first + " " + last);
	}

}
