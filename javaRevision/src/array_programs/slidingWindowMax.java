package array_programs;

import java.util.Scanner;

public class slidingWindowMax {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 6, 3, 2, 6, 8, 4, 9, 3 };

		int k = 3;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= arr.length - k; i++) {

			for (int j = 1; j < k; j++) {
				if (arr[i + j] > max)
					max = arr[i + j];
			}

		}
		System.out.println(max + " <-- max in window");
	}
}
