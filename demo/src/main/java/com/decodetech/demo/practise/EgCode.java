package com.decodetech.demo.practise;

import java.util.Scanner;

public class EgCode {

	public static void main(String[] args) {
		int total = 0;
		System.out.println("Press N for nonveg food and V for veg food ");

		Scanner sc = new Scanner(System.in);
		String foodType = sc.nextLine();

		switch (foodType) {

		case "N":

			int q = 2;
			int d = 3;

			if (d < 3) {
				total = 15 * q;
			} else if (d < 3 && d < 6) {
				total = 15 * q + ((d - 3) * 1);
			} else if (d < 3 && d < 6 && d > 6) {
				total = 15 * q + ((d - 6) * 2);
			}
			System.out.println(total);
			break;

		case "V":

			int Q = 1;
			int D = 7;

			if (D < 3) {
				total = 12 * Q;
			} else if (D < 3 && D < 6) {
				total = 12 * Q + ((D - 3) * 1);
			} else if (D < 3 && D < 6 && D > 6) {
				total = 12 * Q + ((D - 6) * 2);
			}
			System.out.println(total);

			break;

		default:
			System.out.println("-1");
		}

	}
}