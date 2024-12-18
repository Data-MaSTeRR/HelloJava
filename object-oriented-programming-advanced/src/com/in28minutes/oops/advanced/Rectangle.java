package com.in28minutes.oops.advanced;

public class Rectangle {
	
	// State
	private int length;
	private int width;
	
	// Constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	// Behavior
	// 우클릭 - Source - Generate Getter & Setter
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return 2 * (length + width);
	}
	
	
	
	public String toString() { // System.out.println는 객체의 toString() 메서드를 호출함. 
		return String.format("length - %d, width - %d, area - %d, perimeter - %d",
				length, width, area(), perimeter());
 	}
	
}
