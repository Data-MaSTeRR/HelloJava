package com.in28minutes.oops.advanced;

public class Customer {
	
	// State
	private String name;
	private Address homeAddress; // Address 클래스 생성. 객체 컴포지션 이해 
	private Address workAddress;

	
	// Constructor
	public Customer(String name, Address homeAddress) { // workAddress는 선택 
		this.name = name;
		this.homeAddress = homeAddress;
	}

	
	// Behavior
	// 우클릭 - Source - Generate Getter & Setter
	public String getName() { // name은 getter만
		return name;
	}
	
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	public String toString() { // System.out.println는 객체의 toString() 메서드를 호출함. 
		return String.format("name - [%s], home address - [%s], work address - [%s]",
				name, homeAddress, workAddress);
 	}
}
