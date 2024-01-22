package array_programs;

import java.util.Arrays;

public class arrange_0s_and_1s_inArray {

    public static void main(String[] args) {
    
        int [] arr = { 0,1,0,0,1,0,1,1,1,0,1};
        int count = 0;
        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
        // }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            arr[i]=0;
        }

        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}