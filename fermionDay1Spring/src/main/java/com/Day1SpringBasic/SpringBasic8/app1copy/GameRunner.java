package com.Day1SpringBasic.SpringBasic8.app1copy;

public class GameRunner {

	GamingConsoleInterface game;
	
	public GameRunner(GamingConsoleInterface game) {
		this.game = game;
	}
	
	void run() {
		System.out.println("Game running");
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
