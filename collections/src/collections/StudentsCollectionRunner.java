package collections;

import java.util.ArrayList;
import java.util.List;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		
		// List 객체 간편하게 선
		List <Student> students = List.of(new Student(1, "Ranga"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		
		// List 객체를 사용하여 ArrayList 만들기
		List <Student> studentsAl = new ArrayList<>(students);
		
		System.out.println(students);

	}

}
