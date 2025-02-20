package com.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		
		printWithFP(list);
	}
	
	// 기본 
	private static void printBasic(List<String> list) {
		for (String string:list) {
			System.out.println(string);
		}
	}
	
	// 함수형 프로그래밍 - stream 이용 
	private static void printWithFP(List<String> list) {
		list.stream().forEach(
				element -> System.out.println("Element: " + element)
				);
	}
	
	// "at"으로 끝나는 것 filter
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
			.filter(element -> element.endsWith("at")) // 중간 연산 
			.forEach(element -> System.out.println("Element: " + element)); // 중간 연산 
	}

}
