/*

// to Animal.java
package com.in28minutes.oops.inheritance;

abstract public class Animal {
	abstract void bark();
}

// to Dog.java
package com.in28minutes.oops.inheritance;

public class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("Bow Bow");	
	}
	
}

// to Cat.java
package com.in28minutes.oops.inheritance;

public class Cat extends Animal {

	@Override
	void bark() {
		System.out.println("Meow Meow");	
	}
	
} 

// to AnimalRunner.java
package com.in28minutes.oops.inheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		
		// Flyable Array
		Animal[] barkObjects = { new Dog(), new Cat() }; 
		for (Animal object:barkObjects) {
			object.bark();
		}

	}

}

*/