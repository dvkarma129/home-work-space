package com.Day1SpringBasic.SpringBasic8.app2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Address(String city,String state) {};

@Configuration
public class App2BeanClass {

	@Bean
	String name() {
		return "jhon";
	}
	@Bean
	int age() {
		return 34;
	}
	
	@Bean
	Address address(){
		return new Address("mumbai","maha");
	}
	
}
