package array_programs;

public class pracc {
    public static void main(String[] args) {
        
        int arr [] = {10, 7, 8, 1, 8, 7, 6};
        int num =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if (arr[i]==arr[j]) {
                    num = arr[i];
                    break;
                }
            }
        }
        System.out.println("num----> " + num);
    }
}
