package com.Day1SpringBasic.SpringBasic8.app2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2RunClass {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(App2BeanClass.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("address"));
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
