package com.Day1SpringBasic.SpringBasic8.app1.copy;

public class App1RunClass {
	
	public static void main(String[] args) {
		
		
//		var game = new Pacman();
		var game = new Mario();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
