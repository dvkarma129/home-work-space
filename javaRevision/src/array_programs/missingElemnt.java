package array_programs;

public class missingElemnt {
    public static void main(String[] args) {

        int[] arr = { 10, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length + 1;

        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }
        
        System.out.println("Missing element: " + (sum - arrSum));

    }
}
