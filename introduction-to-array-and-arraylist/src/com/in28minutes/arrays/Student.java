package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		
		int sum = 0;	
		for (int mark:marks) {
			sum += mark;
		}
		
		return sum;
	}

	public int getMaximumMark() {
		
		int maximumMark = Integer.MIN_VALUE; // 음수에도 강건하게 함수 사용가능 
		for (int mark:marks) {
			if (mark >= maximumMark) {
				maximumMark = mark;
			}
		}
		
		return maximumMark;
	}

	public int getMinimumMark() {
		int minimumMark = Integer.MAX_VALUE; // 양수에도 강건하게 함수 사용가능 
		for (int mark:marks) {
			if (mark <= minimumMark) {
				minimumMark = mark;
			}
		}
		
		return minimumMark;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int total = getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(total), 3, RoundingMode.UP);
		//98.666666666666666 같은 경우 반올림 어디서 할지 설정해야 함 
	}
	
}
