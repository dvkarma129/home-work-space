package awdiz;

import java.sql.Array;
import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		
		int arr [] = { 0,0,0,0,1,1,1,2,2,3,4};
		int temp = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]!=arr[i-1]) {
				arr[temp]=arr[i];
				temp++;
			}
		}
		int n [] = Arrays.copyOf(arr, temp);
		System.out.println(Arrays.toString(n));
	}
}
