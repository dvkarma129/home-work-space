package array_programs;

public class FindFirstAndLastIndexOfTarget {

	public static void main(String[] args) {

		int[] nums = { 5, 7, 7, 8, 8, 8, 8, 10 };
		int target = 8;

		int first = -1;
		int last = -1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				if (first == -1) {
					first = i;
				}
				last = i;
			}
		}

		System.out.println(first + ", " + last);
	}
}