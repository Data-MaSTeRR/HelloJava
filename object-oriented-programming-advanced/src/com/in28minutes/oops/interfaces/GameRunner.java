package com.in28minutes.oops.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		
		MarioGame marioGame = new MarioGame();
		
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.right();
		
		ChessGame chessGame = new ChessGame();
		
		chessGame.up();
		chessGame.down();
		chessGame.left();
		chessGame.right();
		
	}

}
