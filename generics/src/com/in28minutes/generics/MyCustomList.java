package com.in28minutes.generics;

import java.util.ArrayList;

// 제네릭 클래스 
// <T>를 사용하여 임의의 제너릭 타입. 선언할 때 실제 타입 지정.
// <T extends Number> T가 Number의 Integer, Double, Float만 쓸 수 있도록 제한가능. 
public class MyCustomList<T extends Number> {
	
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	
	public void removeElement(T element) {
		list.remove(element);
	}
	
	public String toString() {
		return list.toString();
	}
	
	// T를 사용하여 임의의 제너릭 타입. 선언할 때 실제 타입 지정. 
	public T get(int index) {
		return list.get(index);
	}
}
