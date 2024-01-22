package array_programs;

public class minMax {

	public static void main(String[] args) {
		
		int arr [] = {1,2,32,454,65,6,7};
		
//		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[i]>arr[j]) {
//					max = arr[i];
//					arr[i] = arr[j];
//					arr[j] = max;
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);	
//		}
//		
//		System.out.println(arr[0]);
//		System.out.println(max);
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}
}
