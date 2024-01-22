package com.Day1SpringBasic.SpringBasic8.app1UsingSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var game = new Game1();
		var appComponentClass = new AppComponentClass(game);
		var context = new AnnotationConfigApplicationContext(AppComponentClass.class);
		appComponentClass.run();
		
	}

}
