package com.in28minutes.oops.interfaces;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("with wings");
	}
	
}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("with fuel");
	}
	
}


public class FlyableRunner {

	public static void main(String[] args) {
		
		// Flyable Array
		Flyable[] flyObjects = { new Bird(), new Aeroplane() }; 
		for (Flyable object:flyObjects) {
			object.fly();
		}
	}

}
