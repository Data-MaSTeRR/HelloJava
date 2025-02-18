package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


// 문자열의 길이가 짧을수록 우선순위 
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length());
	}
	
}

public class QueueRunner {

	public static void main(String[] args) {
		
		// 알파벳 오름차순 우선순위. 선입선출 x 
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
	
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		queue.offer("Elephant");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}

}
