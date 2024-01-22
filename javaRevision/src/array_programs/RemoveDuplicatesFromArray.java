package array_programs;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9 };

        int n = arr.length;
        Arrays.sort(arr);

        int tempArr = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[tempArr] = arr[i];
                tempArr++;      
            }
        }

        int[] uniqueArray = Arrays.copyOf(arr, tempArr);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArray));

    }
}
