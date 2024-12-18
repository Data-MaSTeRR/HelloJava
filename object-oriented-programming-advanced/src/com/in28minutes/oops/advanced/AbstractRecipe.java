package com.in28minutes.oops.advanced;

abstract public class AbstractRecipe {
	
	// [prepare, recipe, cleanup]
	
	//아래 메서드 안에 abstract 선언한 메서드들이 있어 따로 abstract 안해도 됨 
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();


	
	
}
