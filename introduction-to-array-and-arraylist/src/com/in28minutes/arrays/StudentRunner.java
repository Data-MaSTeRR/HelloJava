package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student = new Student("Shim", 97, 98, 99, 100, 100); 
		
		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("total sum of marks: " + sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("maximum of marks: " + maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("minimum of marks: " + minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("average of marks: " + average);
		
		System.out.println(student);
		
		student.addNewMark(35);
		student.removeMarkAtIndex(5);
	}

}
 