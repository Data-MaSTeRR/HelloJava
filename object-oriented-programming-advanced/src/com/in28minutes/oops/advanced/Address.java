package com.in28minutes.oops.advanced;

public class Address {
	
	// State
	private String line1;
	private String city;
	private String zip;
	
	
	// Constructor
	// 우클릭 - Source - Constructor using fields
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}
	
	public String toString() { // System.out.println는 객체의 toString() 메서드를 호출함. 
		return line1 + ", " + city + ", " + zip;
 	}
}
