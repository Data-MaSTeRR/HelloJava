package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = {99, 98, 100};
		
		Student student = new Student("Shim", marks); 
		
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
	}

}
 