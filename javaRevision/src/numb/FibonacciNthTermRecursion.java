package numb;

import java.util.Scanner;

public class FibonacciNthTermRecursion {

	int f = 0,s= 1;
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numb to get fib serires till"); 
		int n = sc.nextInt();
		
		FibonacciNthTermRecursion fb = new FibonacciNthTermRecursion();
		fb.getFibo(n);
	}

	private void getFibo(int n) {
		if (n!=0) {
			System.out.println(f);
			int next = f + s;
			f = s;
			s = next;
			getFibo(n-1);
		}
	}
}
