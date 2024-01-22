package interviewAPR1;

// import java.util.Scanner;

public class sortArrayByLinearSearch {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 65, 7, 34, 6, 9 };
		int temp = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] =  arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
