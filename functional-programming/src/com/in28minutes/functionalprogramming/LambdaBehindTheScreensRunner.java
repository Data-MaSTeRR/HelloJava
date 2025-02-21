package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// 입력값을 보고 참인지 거짓인지 판단 
class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number%2 == 0;
	}
	
}

// 입력값을 주고 그에 대한 소비를 진행 
class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}

// 입력값에 함수 적용해서 출력값 나옴  
class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
	
}

public class LambdaBehindTheScreensRunner {

	public static void main(String[] args) {
		
		// 람다 표현식 사용 
		List.of(23, 43, 34, 45, 36, 48).stream()
			.filter(n -> n%2==0)
			.map(n -> n * n)
			.forEach(e -> System.out.println(e));
		
		// filter 람다표현식의 내부로직을 알아보자 
		List.of(23, 43, 34, 45, 36, 48).stream()
		.filter(new EvenNumberPredicate())
		.forEach(e -> System.out.println(e));
		
		// forEach 람다표현식의 내부로직을 알아보자 
		List.of(23, 43, 34, 45, 36, 48).stream()
			.filter(n -> n%2==0)
			.forEach(new SystemOutConsumer());
		
		// map 람다표현식의 내부로직을 알아보자 
		List.of(23, 43, 34, 45, 36, 48).stream()
		.filter(n -> n%2==0)
		.map(n -> n * n)
		.forEach(e -> System.out.println(e));
		
	}

}
