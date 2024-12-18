package com.in28minutes.oops.inheritance;

public class StudentWithoutInheritance {
	
	// State
	private String name;
	private String email;
	private String phoneNumber;
	
	private String collegeName;
	private int year;
	
	
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
	public String getCollege() {
		return collegeName;
	}
	public void setCollege(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}
