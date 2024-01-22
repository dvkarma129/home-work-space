package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class slidingWindowMaximum {

	public static void main(String[] args) {
		int[] arr = { 1,3,-1,-3,5,3,6,7};

		int k = 3;

		int[] ansArr = new int[arr.length];
		for (int i = k; i <= arr.length; i++) {
			int max = Integer.MIN_VALUE;

			for (int j = i - k; j < i; j++) {
				max = Math.max(max, arr[j]);
			}
			ansArr[i - k] = max;
		}
		System.out.println(Arrays.toString(ansArr));
	}

}