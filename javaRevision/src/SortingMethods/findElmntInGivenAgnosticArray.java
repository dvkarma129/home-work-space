package SortingMethods;

public class findElmntInGivenAgnosticArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = 6;

        findElmntInGivenAgnosticArray f = new findElmntInGivenAgnosticArray();
        System.out.println(f.ans(arr, x));

    }

    private int ans(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == x)
                return mid;

            if (isAsc) {
                if (arr[mid] < x) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > x)
                    start = mid + 1;

                else
                    end = mid - 1;

            }

        }
        return -1;
    }
}
