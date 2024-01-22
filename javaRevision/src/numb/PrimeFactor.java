package numb;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get prime factors");
		int n = sc.nextInt();
		
		
		if (n>2) {
			while (n!=0) {
				
				for (int i = 2; i <= n; i++) {
					
					if (n%i==0) {
						System.out.println(i);
						n = n/i;
					}
				}
			}
		}
		
	}
}
