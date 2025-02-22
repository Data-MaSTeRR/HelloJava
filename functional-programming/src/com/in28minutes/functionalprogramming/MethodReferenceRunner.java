package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferenceRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant")
			.stream().map(s -> s.length())
			.forEach(s -> System.out.println(s));
		
		// 클래스::메서드 - 메서드 참조 방식 
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant")
			.stream().map(String::length)
			.forEach(System.out::println);
		
		// 클래스::메서드 - static 메서드 생성으로도 가능 
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant")
			.stream().map(String::length)
			.forEach(MethodReferenceRunner::print);
		
		// Integer::compare 많이 사용함 
		Integer maxList = List.of(23, 45, 67, 34).stream()
			.filter(n -> n%2 == 0)
			.max(Integer::compare)
			.get()
			;
		System.out.println(maxList);
			
	}

}
