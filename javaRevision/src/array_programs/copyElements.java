package array_programs;

public class copyElements {
    public static void main(String[] args) {

        int []  arr1 = {1,3,2,5,4,7,8};
        int length = arr1.length;

        int [] arr2 = new int[length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
