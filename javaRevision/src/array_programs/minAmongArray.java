package array_programs;


import java.util.Scanner;

public class minAmongArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter element of array ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("smallest element is " + min);

    }
}