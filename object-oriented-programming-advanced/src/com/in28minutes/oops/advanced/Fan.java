package com.in28minutes.oops.advanced;

public class Fan {
	
	// State
	private String make;
	private double radius;
	private String color;
	
	private boolean isOn;
	private byte speed; // 0 to 5
	
	
	// Constructor
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	} 
	
	
	// Behavior
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)5); // 스위치를 키면 자동으로 speed = 5
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0); // 스위치를 끄면 자동으로 speed = 0
	}
	
	
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	public String toString() { // System.out.println는 객체의 toString() 메서드를 호출함. 
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",
				make, radius, color, isOn, speed);
 	}


	
	
	
	
	
}
