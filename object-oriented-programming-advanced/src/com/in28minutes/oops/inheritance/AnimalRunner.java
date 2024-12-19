// to AnimalRunner.java
package com.in28minutes.oops.inheritance;

public class AnimalRunner {
	
	// to Animal.java
	abstract static class Animal {
		abstract void bark();
	}
	
	// to Dog.java
	class Dog extends Animal {
		
		@Override
		public void bark() { 
			System.out.println("Bow Bow");	
		}
		
	}
	
	// to Cat.java
	class Cat extends Animal {
		
		@Override
		public void bark() {
			System.out.println("Meow Meow");	
		}
		
	} 

	public static void main(String[] args) {
		
		AnimalRunner runner = new AnimalRunner(); // 외부 클래스의 인스턴스 생성
        Animal[] barkObjects = { runner.new Dog(), runner.new Cat() }; // 내부 클래스 생성
        
		for (Animal object:barkObjects) {
			object.bark();
		}

	}

}
