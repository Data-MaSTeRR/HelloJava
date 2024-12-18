package com.in28minutes.oops.advanced;

public class Review {
	
	// State
	private int id;
	private String description;
	private int rating;
	
	
	// Constructor
	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	
	
	// Behavior
	public String toString() { // System.out.println는 객체의 toString() 메서드를 호출함. 
		return id + ", " + description + ", " + rating;
 	}


}
