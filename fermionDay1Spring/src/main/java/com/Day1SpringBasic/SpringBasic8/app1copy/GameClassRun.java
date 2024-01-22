package com.Day1SpringBasic.SpringBasic8.app1copy;

import com.Day1SpringBasic.SpringBasic8.app1.GamingConsole;

public class GameClassRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var game = new Game2();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
