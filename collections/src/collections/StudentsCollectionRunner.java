package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		return Integer.compare(stu2.getId(), stu1.getId());
	}
	
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		
		// List 객체 간편하게 만들기 
		List <Student> students = List.of(new Student(1, "Ranga"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		
		// List 객체를 사용하여 ArrayList 만들기
		List <Student> studentsAl = new ArrayList<>(students);
		
		System.out.println(studentsAl);
		
		// 오름차순 
		Collections.sort(studentsAl);
		System.out.println("Asc " + studentsAl);
		
		// 내림차순 
		// studentAl.sort(new DescendingStudentComparator()) 와 동
		Collections.sort(studentsAl, new DescendingStudentComparator());
		System.out.println("Desc " + studentsAl);

	}

}
