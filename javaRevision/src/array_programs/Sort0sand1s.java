package array_programs;

import java.util.Iterator;

public class Sort0sand1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 0, 0, 1, 1, 0, 1, 1, 0, 1 };

		int zeroCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroCount++;
			}
		}

		for (int i = 0; i < zeroCount; i++) {
			arr[i] = 0;
		}
		
		for (int i = zeroCount; i < arr.length; i++) {
			arr[i] = 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
