package com.in28minutes.oops;

public class MotorBike {

	// State
	private int speed; // member variable

	// 생성자
	public MotorBike() {
		// this.speed = 5;
		this(5);
	}

	public MotorBike(int speed) {
		this.speed = speed;
	}

	// Behavior
	public void setSpeed(int speed) { // local variable
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
		// this.speed += howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
		/*
		 * if (this.speed - howMuch > 0) { this.speed -= howMuch; }
		 */
	}

	public int getSpeed() {
		return this.speed;
	}

	void start() {
		System.out.println("Bike Started");
	}

}
