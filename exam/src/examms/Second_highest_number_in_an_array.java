package examms;

import java.util.Arrays;
import java.util.Scanner;

public class Second_highest_number_in_an_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int length = sc.nextInt();
		
		int array1 [] = new int [length];
		
		System.out.println("Enter " + length + " elements in array: ");
		for (int i = 0; i < length; i++) {
			array1[i] = sc.nextInt();
		}
		
		System.out.println("Given array is " + Arrays.toString(array1));
		
		Arrays.sort(array1);
		System.out.println("Second highest element is " + array1[length-2]);

	}

}
