package array_programs;

public class find_pair_whose_sum_is_closest_toX {

    public static void main(String[] args) {
        int X = 3;
        int[] arr = { -40, -5, 1, 3, 6, 7, 8, 20 };
        int min = Math.abs(arr[0] + arr[1] - X);
        int f = 0;
        int s = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = Math.abs(arr[i] + arr[j] - X);
                if (temp < min) {
                    f = i;
                    s = j;
                    min = temp;
                }
            }
        }
        System.out.println(" The pair whose sum is closest to X using brute force method: " + arr[f] + " " + arr[s]);
    }
}