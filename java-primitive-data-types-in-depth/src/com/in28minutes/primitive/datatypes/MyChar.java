package com.in28minutes.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	// 모음을 가지고 있는지 확인하는 메서드
	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}

	// 자음을 가지고 있는지 확인하는 메서드
	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) { // uni-code digit scope '0' ~ '9'
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 97 && ch <= 122) { // uni-code alphabet scope 'a' ~ 'z'
			return true;
		}

		if (ch >= 65 && ch <= 90) { // uni-code alphabet scope 'A' ~ 'Z'
			return true;
		}

		return false;
	}

	public static void printLowerCaseAlphabts() { // 정적 메서드는 클래스에서 데이터를 만지지 않을 때 사용
		// 'a' to 'z'
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabts() {
		// 'a' to 'z'
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}
