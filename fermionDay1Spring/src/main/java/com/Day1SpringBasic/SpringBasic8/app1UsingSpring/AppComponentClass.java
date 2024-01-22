package com.Day1SpringBasic.SpringBasic8.app1UsingSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppComponentClass {

	GameConsoleInterface game;

//	@Bean
	public AppComponentClass(GameConsoleInterface game) {
		this.game = game;
	}
	
	@Bean
	void run() {
		System.out.println("Running game spring bean");
		game.left();
		game.right();
		game.up();
		game.down();
	}
}
