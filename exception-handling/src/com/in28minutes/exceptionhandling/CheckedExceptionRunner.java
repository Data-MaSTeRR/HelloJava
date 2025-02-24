// Exception Hierarchy 
// Throwable <- Exception <- RuntimeException <- NullPointerException 

package com.in28minutes.exceptionhandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		
		// 방법1: try-catch
		try {
			someOtherMethod();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	// 방법2: throws로 오류 던지기 -> 떠넘기기 불가 (파일 입출력이나 데이터베이스 연결 등 외부 자원과의 상호작용에서 주로 발생)
	// RuntimeException 외 checked exception 
	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);	
	}
	
	// 방법2: throws로 오류 던지기 -> 떠넘기기 가능 (주로 프로그래밍 오류나 논리적 실수)
	// RuntimeException 자식 클래스 unchecked exception
	private static void someOtherMethod2() throws RuntimeException {
		String str = null;
		str.length();
	}

}
