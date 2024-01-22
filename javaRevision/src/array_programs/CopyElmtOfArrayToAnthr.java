package array_programs;

import java.util.Scanner;

public class CopyElmtOfArrayToAnthr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elments needed");
        int n = sc.nextInt();

        System.out.println("enter " + n + " elemnts to array");

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {//{1,2,3}
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Elemnts of orignal array");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("Elemnts of copied array");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
