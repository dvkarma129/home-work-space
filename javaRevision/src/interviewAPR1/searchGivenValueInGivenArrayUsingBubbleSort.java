package interviewAPR1;

import java.util.Scanner;

public class searchGivenValueInGivenArrayUsingBubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elemnt to find in array");
        int x = sc.nextInt();

        int[] arr = { 1, 3, 4, 5, 6, 7, 43, 22, 21, 87, 76, 67, 54 };
        boolean found = false;

//        int i;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                found = true;
                System.out.println("Element " + x + " found at index " + i);
                break;
            }
        }
        
        if (!found) {
            System.out.println("elmnt not in found the array");
        }
    }
}