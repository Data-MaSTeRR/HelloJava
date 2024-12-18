package com.in28minutes.oops.inheritance;

public class Student extends Person {
	
	// State
	private String collegeName;
	private int year;
	
	
	// Behavior
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	// Overriding 
	public String toString() {
		// super는 상위 클래스에서 값을 가져오게 해줌 
		return super.getName() + ", " + super.getEmail() + ", " + super.getPhoneNumber() + ", " + collegeName + ", " + year;
	}
	
}
