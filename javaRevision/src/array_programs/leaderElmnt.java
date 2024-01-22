package array_programs;

public class leaderElmnt {

    public static void main(String[] args) {

        int arr[] = { 14, 12, 70, 15, 99, 65, 21, 90 };
        int res = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                if (res < arr[i]) {

                    res = arr[i];
                }
            }
        }

        System.out.println(res);
    }
}
