package com.in28minutes.oops.advanced;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the materials");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dish");
	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the utensils");
	}
	
	
}
