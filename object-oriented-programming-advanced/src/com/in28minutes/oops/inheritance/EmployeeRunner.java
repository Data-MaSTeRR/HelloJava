package com.in28minutes.oops.inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setName("HW. S");
		employee.setEmail("hyunwoo8504@gmail.com");
		employee.setPhoneNumber("010-0000-0000");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");
		
		System.out.println(employee);
		
	}

}
