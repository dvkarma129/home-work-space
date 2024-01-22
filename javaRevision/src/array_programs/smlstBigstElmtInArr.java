package array_programs;

import java.util.Scanner;

public class smlstBigstElmtInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");

        int n = sc.nextInt();

        int arr[] = new int[n];


        System.out.print("Enter element for array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = 0;// stores the smallest element 
        //{1,2,14,6,7,9}
        for (int i = 0; i < arr.length; i++) {//1
            for (int j = i + 1; j < arr.length; j++) {//2
                if (arr[i] < arr[j]) {//1<2,
                    temp = arr[i];//1,
                    arr[i] = arr [j];//2
                    arr [j] = temp;//1

                }
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println();
        System.out.println("Smallest element is: " + arr[0]);
        System.out.println("Biggest element is: " + arr[n-1]);
    }
}
