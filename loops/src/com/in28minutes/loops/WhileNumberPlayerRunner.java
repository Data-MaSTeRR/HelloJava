package com.in28minutes.loops;

public class WhileNumberPlayerRunner {

	public static void main(String[] args) {

		WhileNumberPlayer player = new WhileNumberPlayer(10);

		// Limit 30
		player.printSquaresUptoLimit();
		player.printCubesUptoLimit();

	}
}
