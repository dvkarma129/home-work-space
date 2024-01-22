package array_programs;

public class find_pair_whose_sum_is_closest_toZero {

    public static void main(String[] args) {

        int[] arr = { 1, 3, -5, 7, 8, 20, -40, 6 };

        int minSum = arr[0] + arr[1];
        int f = 0;
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tempSum = arr[i] + arr[j];
                if (Math.abs(tempSum) < Math.abs(minSum)) {
                    f = i;
                    s = j;
                    minSum = tempSum;
                }
            }
        }
        System.out.println("Pair sum of " + arr[f] + " & " + arr[s] + " is closest to zero\nSum is " + minSum);
    }
}
