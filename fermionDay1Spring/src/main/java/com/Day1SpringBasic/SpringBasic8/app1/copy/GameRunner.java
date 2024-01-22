package com.Day1SpringBasic.SpringBasic8.app1.copy;

public class GameRunner {

	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		
		System.out.println("Running game" + game.toString());
		game.right();
		game.left();
		game.up();
		game.down();
	}
}
