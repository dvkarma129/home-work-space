package com.decodetech.demo.practise;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		char[] vowel = {'a','e','i','o','u'};
		char[] ch = s.toCharArray();
		String k = "";
		for (int i = 0; i < vowel.length; i++) {
			int counter = 1;
			if (!k.contains("" + ch[i])) {
				for (int j = 0; j < ch.length-1; j++) {
					if (ch[i] == vowel[j]) {
						counter++;
						k = k + ch[j];
					}
				}
				System.out.println(ch[i] + " --> " + counter);
			}
		}
		System.out.println("K --> " + k);
		System.out.println("K --> " + k.length());
	}
}
