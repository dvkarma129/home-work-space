package array_programs;

public class reverserray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int[] aar2 = new int[arr.length];

        for (int j = 0; j < aar2.length; j++) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
