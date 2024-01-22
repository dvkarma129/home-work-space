package com.Day1SpringBasic.SpringBasic8.app1UsingSpring;

public class Game1 implements GameConsoleInterface{

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("crouch");
	}
	
	public void left() {
		System.out.println("go back");
	}
	public void right() {
		System.out.println("Move forward");
	}
}
