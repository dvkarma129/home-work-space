package SortingMethods;

public class findElmntUsingBinarySearch {

    public static void main(String[] args) {
        findElmntUsingBinarySearch f = new findElmntUsingBinarySearch();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int x = 6;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (x < arr[mid]) {
                end = mid - 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println(mid);
                break;
            }
        }
    }
}
