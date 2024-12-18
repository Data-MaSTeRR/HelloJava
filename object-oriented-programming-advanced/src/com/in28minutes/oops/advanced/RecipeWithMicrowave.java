package com.in28minutes.oops.advanced;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the materials");
		System.out.println("Switch on the microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Get stuff ready");
		System.out.println("Put it in the microwave");
	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the utensils");
		System.out.println("Switch off the microwave");
	}
	
}
