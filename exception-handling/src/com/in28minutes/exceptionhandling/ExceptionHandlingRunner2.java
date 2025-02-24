package com.in28minutes.exceptionhandling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		
		method1();
		System.out.println("Main Ended");
	}

	private static void method1() {
		 method2();
		 System.out.println("Method1 Ended");
	}
	
	private static void method2() {
		try { 
			String str = null;
			str.length();
			System.out.println("Method2 Ended");
		} catch (NullPointerException ex) { 
			System.out.println("Matched NullPointerException");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			ex.printStackTrace();
		} catch (Exception ex) { // Exception에도 계층이 있음 NullPointerException -> RuntimeException -> Exception 
			ex.printStackTrace(); // Stack Trace로 문제의 원인과 경로 볼 수 있음. 
		}
		
	}

}
