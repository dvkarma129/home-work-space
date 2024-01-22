package numb;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numb");
		int n = sc.nextInt();
		
		Long fact =1l;
		for (int i = 1; i <= n ; i++) {
			fact = fact * i;
		}
		
		System.out.println("factorial of given num is " + fact);
	}
}
