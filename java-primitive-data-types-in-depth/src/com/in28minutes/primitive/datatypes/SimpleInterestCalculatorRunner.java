package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator caculator = new SimpleInterestCalculator("4500.00", "7.5"); // 계산기 객체 생성
		BigDecimal totalValue = caculator.calculateTotalValue(5); // 5 years
		System.out.println(totalValue);
	}

}
