package numb;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n,sum = 0;
		while(temp!=0) {
			int rem = temp%10;
			sum = sum + rem;
			temp = temp/10;
		}
		
		System.out.println("sum " + sum);
	}
}
