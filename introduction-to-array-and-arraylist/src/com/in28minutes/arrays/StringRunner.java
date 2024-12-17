package com.in28minutes.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday"}; // String 클래스 간편법 가능 
		
		// 요일 중 가장 길이가 긴 요일 출력 
		String dayWithMostCharacters = "";
		for (String day:daysOfWeek) {
			if (day.length() >= dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		System.out.println("Day with most number of characters: " + dayWithMostCharacters);
		
		// 요일 Array 역순으로 출력 
		for (int i = daysOfWeek.length - 1; i>= 0; i-- ) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
