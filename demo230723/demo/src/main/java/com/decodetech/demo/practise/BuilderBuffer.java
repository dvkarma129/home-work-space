package com.decodetech.demo.practise;

public class BuilderBuffer {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("AAB");
		System.out.println("sb --> " + sb);
		
		StringBuilder sb1 = new StringBuilder("ADC");
		System.out.println("sb1 --> " + sb1);
		
		System.out.println("comapre to value --> " + sb.toString().equals(sb1.toString()));
	}

}
