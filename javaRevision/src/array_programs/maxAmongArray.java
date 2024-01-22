package array_programs;

import java.util.Scanner;

public class maxAmongArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter " + n + " elemnts in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[j] + " ");    
        }
        System.out.println();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Biggest elments in array is " + max);
    }
}