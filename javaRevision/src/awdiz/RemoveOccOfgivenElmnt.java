package awdiz;

import java.util.Arrays;

public class RemoveOccOfgivenElmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,2,3};
		int val = 3;
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=val) {
				count++;
			}
		}
		
		int newArr []= new int [count];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=val) {
				newArr[j] = arr[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(newArr));

	}

}
