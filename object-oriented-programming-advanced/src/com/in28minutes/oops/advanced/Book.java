package com.in28minutes.oops.advanced;

import java.util.ArrayList;

public class Book {
	
	// State
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>(); // ArrayList로 reviews 관리 
		
	
	// Constructor
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	
	// Behavior
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public String toString() { // System.out.println는 객체의 toString() 메서드를 호출함. 
		return String.format("id - %d, name - %s, author - %s, reviews - [%s]",
				id, name, author, reviews);
 	}
	
}
