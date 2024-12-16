package com.in28minutes.loops;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		// 제곱
		int i = 1;
		while (i * i <= limit) {
			System.out.print(i * i + " ");
			i++;
		}
	}

	public void printCubesUptoLimit() {
		// 세제곱
		int i = 1;
		while (i * i * i <= limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
	}

}
