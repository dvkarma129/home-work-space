package matrix;

import java.util.Scanner;

public class matrixx {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int arr [] [] = new int [3] [3];
		System.out.println("Enter elmnts of the matrix ");
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				arr[i] [j] = sc.nextInt();
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				System.out.print (arr[i] [j] + " ");
			}
			System.out.println();
		}
	}
}
