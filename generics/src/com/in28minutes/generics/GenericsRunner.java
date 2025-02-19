package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

import com.in28minutes.generics.MyCustomList;

public class GenericsRunner {
	
	// 제네릭 메소드 
	// <X>는 임의의 타입 
	static <X> X doubleValue(X value) {
		return value;
	}
	
	// X는 반드시 List의 하위 타입 
	static <X extends List> void duplicate(X list) {
		list.addAll(list); // 자기 자신의 내용을 복사 후 병합 
	}
	
	// 제네릭 와일드카드 - 상계 (읽기전용) 
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number:numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}
	
	// 제네릭 와일드카드 - 하계 (쓰기전용) 
	static void addCoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
		
	}
	
	
	public static void main(String[] args) {
		
		// 쓰기 전용 
		List emptyList = new ArrayList<Number>();
		addCoupleOfValues(emptyList);
		System.out.println(emptyList);
		
		// 읽기전용
		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l ,5l)));
		
		String value1 = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		duplicate(numbers);
		System.out.println(numbers);
		
		
		/*
		MyCustomList<String> list1 = new MyCustomList<>();
		list1.addElement("Element 1");
		list1.addElement("Element 2");
		String value = list1.get(0);
		System.out.println(list1);
		System.out.println(value); 
		*/
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number = list2.get(0);
		System.out.println(list2);
		System.out.println(number);
		
		MyCustomList<Long> list3 = new MyCustomList<>();
		list3.addElement(3l);
		list3.addElement(6l);
		Long numberrr = list3.get(1);
		System.out.println(list3);
		System.out.println(numberrr); 
		
	}

}
