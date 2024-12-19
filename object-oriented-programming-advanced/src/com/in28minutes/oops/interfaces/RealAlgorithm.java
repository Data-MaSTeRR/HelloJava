package com.in28minutes.oops.interfaces;

public class RealAlgorithm implements ComplexAlgorithm { // implements => 구현 

	@Override
	public int complexAlgorithm(int number1, int number2) {
		return number1 * number2;
	}

}
