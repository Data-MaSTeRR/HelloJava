package com.in28minutes.oops.advanced;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.34567, "Green");
		
		fan.switchOn(); // 5
		fan.setSpeed((byte)3); // 3
		System.out.println(fan);
				
		fan.switchOff(); // 0
		System.out.println(fan);
		
	}

}
