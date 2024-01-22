package array_programs;

import java.util.Arrays;

public class removeDup {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 5, 6, };
		int j = 1;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i + 1];
				j++;
			}
		}

		int[] uni = Arrays.copyOf(arr, j);
		System.out.println(Arrays.toString(uni));

	}
}
