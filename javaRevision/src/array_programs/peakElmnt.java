package array_programs;

public class peakElmnt {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 346, 5, 6, 6, 72, 345, 63, 45, 49,550,456 };
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1])) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        System.out.println(max);
    }
}
