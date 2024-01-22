package array_programs;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		char[] s = { 'h', 'e', 'l', 'l', 'o' };
//		int i = 0;
//		int j = s.length-1;
//		
//		while(i<j) {
//			char temp = s[i];
//			s[i] = s[j];
//			s[j] = temp ;
//			i++;
//			j--;
//		}
//		
//		System.out.println(s);

		
		int [] arr = {1,2,3,4,5,6};
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
