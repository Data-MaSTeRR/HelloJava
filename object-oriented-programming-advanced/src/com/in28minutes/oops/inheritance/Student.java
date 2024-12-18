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
		return collegeName + ", " + year;
	}
	
}
