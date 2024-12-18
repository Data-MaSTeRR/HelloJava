package com.in28minutes.oops.advanced;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1", "Seoul", "00475"); // 집주소 객체 
		Customer customer = new Customer("Shim", homeAddress);
	
		Address workAddress = new Address("line 1", "Suwon", "11732"); // 회사주소 객체 
		customer.setWorkAddress(workAddress); // 고객 객체에 회사주소 객체 연결 
	
		System.out.println(customer);
	}

}
