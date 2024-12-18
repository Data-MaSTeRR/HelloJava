package com.in28minutes.oops.inheritance;

public class Person extends Object { // Object 에서 상속받는 것은 기본값 
	
	// State
	private String name;
	private String email;
	private String phoneNumber;
	
	
	// Behavior
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// Overriding 
	public String toString() {
		return name + ", " + email + ", " + phoneNumber;
	}

}
