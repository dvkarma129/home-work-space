package awdiz;

import java.util.Arrays;

public class sortAsec {

	public static void main(String[] args) {
		
		int arr [] = {1,54,21,53,11,32,4,2,87,22};
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					max = arr[i];
					arr[i] = arr[j];
					arr[j] = max;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
