package array_programs;

import java.util.Arrays;

public class SeprateOdd_EvenElement {
	
	//Example input --> {2,3,4,5,6,7}  output --> {2,4,6,3,5,7}
	
	public static void main(String[] args) {
		
		int arr [] = {2,3,4,5,7,8,9};
		int arr2[] = new int [arr.length];
		int j =0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				arr2[j] = arr[i];
				j++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				arr2[j] = arr[i];
				j++;
			}
		}
		
		
		System.out.println(Arrays.toString(arr2));
		
	}
}
