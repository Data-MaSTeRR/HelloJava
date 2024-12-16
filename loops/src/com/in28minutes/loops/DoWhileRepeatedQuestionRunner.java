package com.in28minutes.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

	public static void main(String[] args) {
		
		// 최소한 질문을 한 번이라고 하기 위해 do-while
		int number;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Enter a Number: ");
			number = scanner.nextInt();
			System.out.println("Cube is " + (number * number * number));
		} while (number >= 0);
	}
}
