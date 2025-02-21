package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		
		/*
		numbers.stream()
				.forEach( element -> System.out.println(element));
		
		// 0은 초기값 역할, reduce는 스트림 요소들을 누적하여 하나의 결과값으로 만드는 연산을 수
		int sum = numbers.stream()
				.filter(number -> number % 2 == 1)
				.reduce(
				0, 
				(number1, number2) -> number1 + number2 
				);*/
		
		// 함수형 프로그래밍 메서드 사용 
		int sum = fpSum(numbers);
		
		System.out.println(sum);
		
		System.out.println(List.of(23, 12, 34, 53).stream().filter(e -> e%2==0).collect(Collectors.toList()));
		System.out.println(IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList()));

	}
	
	// 리스트의 총합 
	// 함수형 프로그래밍 - stream
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> number1 + number2 );
	}
	
	// 일반 절차적 프로그래밍 
		private static int normalSum(List<Integer> numbers) {
			int sum = 0;
			for (int number:numbers) {
				sum += number;
			}
			return sum;
		}

}
