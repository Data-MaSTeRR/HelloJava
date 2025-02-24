package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			
			int[] numbers = {12, 3, 4, 5};
			int number = numbers[5];
					
		} catch (Exception e){
			e.printStackTrace();
		} finally { // 메모리 누수가 일어나지 않게 예외처리가 발생하더라도 scanner를 close! 
			System.out.println("Before Scanner Close");
			if (scanner != null) { // null 상태에서 close() 메서드를 호출하면 NullPointerException이 발생하기 때문
			scanner.close();
			}
		}
		
		System.out.println("Just before closing out main");
	}

}
