package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>(); // ArrayList는 간편법 불가! 

	public Student(String name, int... marks) { // 가변 인수 사용 (인수의 마지막에 와야 인식함) 
		this.name = name;
		
		for (int mark:marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() { 
		return marks.size();
	}
 
	public int getTotalSumOfMarks() {
		
		int sum = 0;	
		for (int mark:marks) {
			sum += mark;
		}
		
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
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
	
	// String 을 객체가 아닌 이름으로 출력시켜주는 함수 
	public String toString() {
		return name + marks;
	} 
	
	
	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
	
}
