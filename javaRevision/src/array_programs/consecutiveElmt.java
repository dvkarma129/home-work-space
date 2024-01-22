package array_programs;

import java.util.Arrays;

public class consecutiveElmt {

    public static void main(String[] args) {

        int[] arr = { 1, 66, 3, 14, 5, 26, 7,9, 8 };
        boolean consecutive = false;
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]+1 == arr[i+1])  {
				consecutive = true;		
			} 
		}
         
        if (consecutive) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}
    }
}
