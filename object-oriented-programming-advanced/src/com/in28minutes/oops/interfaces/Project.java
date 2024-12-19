package com.in28minutes.oops.interfaces;

public class Project {

	public static void main(String[] args) {
		// ComplexAlgorithm algorithm = new DummyAlgorithm();
		ComplexAlgorithm algorithm = new RealAlgorithm(); // Dummy -> Real
		System.out.println(algorithm.complexAlgorithm(10, 20));
	}

}
