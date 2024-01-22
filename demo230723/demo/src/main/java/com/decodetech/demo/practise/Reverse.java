package com.decodetech.demo.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int a = sc.nextInt();

		List<Integer> num = new ArrayList<Integer>();
		List<Integer> rev = new ArrayList<Integer>();
		System.out.println("Enter elements into array");
		for (int i = 1; i <= a; i++) {
			num.add(sc.nextInt());
		}

		System.out.println("Elements of array are --> " + num);
		for (int i = num.size()-1; i >= 0; i--) {
			rev.add(num.get(i));
		}
		System.out.println("Reverse of elements of array are --> " + rev);

	}

}
