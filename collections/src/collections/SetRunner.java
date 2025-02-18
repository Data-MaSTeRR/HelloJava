package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		// unique - Set
		// TreeSet, HashSet, LinkedHashSet
		
		// 순서대로 x, 오름차순 정렬 o 
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("TreeSet: " + treeSet);
		
		// 순서대로 o, 오름차순 정렬 x
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("LinkedHashSet: " + linkedHashSet);
		
		// 규칙 없음 
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("HashSet: " + hashSet);
		
	}

}
