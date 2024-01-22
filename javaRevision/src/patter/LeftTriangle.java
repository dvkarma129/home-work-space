package patter;

import java.util.Scanner;

public class LeftTriangle {
	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * * * 

//	0 
//	0 1 
//	0 1 2 
//	0 1 2 3 
//	0 1 2 3 4 
//	0 1 2 3 4 5 
	
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 
//	16 17 18 19 20 21 
	
//	1 
//	0 1 
//	1 0 1 
//	0 1 0 1 
//	1 0 1 0 1 
//	0 1 0 1 0 1 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int n = sc.nextInt();
		
//		int k =1;
		for (int i = 0; i <= n ; i++) {
			for (int j = 0; j <= i; j++) {
//				System.out.print(" ");
//				System.out.print(k++ + " ");
				System.out.print("* ");
//				if ((i+j) % 2==0) {
//					System.out.print("1");
//				} else {
//					System.out.print("0");
//				}
			}
			System.out.println();
		}
		
		
	}

}
