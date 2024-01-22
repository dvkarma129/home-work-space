package com.decodetech.demo.service;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOdd {
	

	private void segrigate(ArrayList<Integer> num) {
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for(int i=0; i<=num.size()-1; i++) {
			if(num.get(i) % 2 == 0) {
				even.add(num.get(i));
			} else {
				odd.add(num.get(i));
			}
		}
		
		System.out.println("Even in list --> " + num + " are --> " + even);
		System.out.println("Odd in list --> " + num + " are --> " + odd);
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(2,5,88,29,16,3,27,58,53,71,68));
		EvenOdd evenOdd = new EvenOdd();
		evenOdd.segrigate(num);
		
	}

}
