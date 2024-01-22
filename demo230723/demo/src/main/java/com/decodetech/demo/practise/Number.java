package com.decodetech.demo.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int a = sc.nextInt();

		List<Integer> num = new ArrayList<Integer>();
		System.out.println("Enter elements into array");
		for (int i = 1; i <= a; i++) {
			num.add(sc.nextInt());
		}

		System.out.println("Elements of array are --> " + num);

		List<Integer> twothreefive = new ArrayList<Integer>();
		List<Integer> twothree = new ArrayList<Integer>();
		List<Integer> threefive = new ArrayList<Integer>();
		List<Integer> twofive = new ArrayList<Integer>();
		List<Integer> two = new ArrayList<Integer>();
		List<Integer> three = new ArrayList<Integer>();
		List<Integer> five = new ArrayList<Integer>();
		List<Integer> none = new ArrayList<Integer>();

		for (int i = 0; i < num.size(); i++) {
			if (num.get(i) % 2 == 0 && num.get(i) % 3 == 0 && num.get(i) % 5 == 0) {
				twothreefive.add(num.get(i));
			} else if (num.get(i) % 2 == 0 && num.get(i) % 3 == 0) {
				twothree.add(num.get(i));
			} else if (num.get(i) % 3 == 0 && num.get(i) % 5 == 0) {
				threefive.add(num.get(i));
			} else if (num.get(i) % 2 == 0 && num.get(i) % 5 == 0) {
				twofive.add(num.get(i));
			} else if (num.get(i) % 2 == 0) {
				two.add(num.get(i));
			} else if (num.get(i) % 3 == 0) {
				three.add(num.get(i));
			} else if (num.get(i) % 5 == 0) {
				five.add(num.get(i));
			} else {
				none.add(num.get(i));
			}
		}

		System.out.println("Elements divisible by 2,3,5 are --> " + twothreefive);
		System.out.println("Elements divisible by 2,3 are --> " + twothree);
		System.out.println("Elements divisible by 3,5 are --> " + threefive);
		System.out.println("Elements divisible by 2,5 are --> " + twofive);
		System.out.println("Elements divisible by 2 are --> " + two);
		System.out.println("Elements divisible by 3 are --> " + three);
		System.out.println("Elements divisible by 5 are --> " + five);
		System.out.println("Elements divisible not by 2,3,5 are --> " + none);
		
	}
}
