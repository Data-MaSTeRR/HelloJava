package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		
		// try-with-resources 구문을 사용하면 try 괄호 내에 선언된 리소스(예: Scanner)가 블록 종료 시 자동으로 close() 메서드가 호출되어 정리
		try (Scanner scanner = new Scanner(System.in)) {
			
		int[] numbers = {12, 3, 4, 5};
		int number = numbers[5];		
	
		}
	}

}
