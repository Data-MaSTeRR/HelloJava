package com.in28minutes.primitive.datatypes;

public class MyCarRunner {

	public static void main(String[] args) {

		MyChar myChar = new MyChar('c');

		System.out.println(myChar.isVowel()); // 'a','e','i','o','u' and Capitals
		System.out.println(myChar.isConsonant());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());

		MyChar.printLowerCaseAlphabts();
		MyChar.printUpperCaseAlphabts();
	}

}

