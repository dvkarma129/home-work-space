package array_programs;

import java.util.Iterator;

public class rotateArrayyy {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6};
		
		int k =3;
		for (int i = 0; i < 3; i++) {
			int first =arr[0];
			int j;
			for (j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[j]=first;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
