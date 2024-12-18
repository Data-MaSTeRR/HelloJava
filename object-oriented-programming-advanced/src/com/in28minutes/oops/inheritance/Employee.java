package com.in28minutes.oops.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	
	// State
	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;
	
	
	
	// Behavior
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
	// Overriding 
	public String toString() {
		// super는 상위 클래스에서 값을 가져오게 해줌 
		return super.toString() + ", " 
				+ title + ", " + employerName + ", " + employeeGrade + ", " + salary;
	}
	
}
