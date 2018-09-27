package week04_quiz;

import java.util.HashSet;
import java.util.Set;

public class Question14_intersection {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set1.add("Atlanta");
		set1.add("Macon");
		
		set2.add("Atlanta");
		set2.add("Macon");
		set2.add("Savannah");
		
//		System.out.println(set1.intersect(set2));
//		System.out.println(set1.join(set2));
//		Set<String> intersection = new HashSet<>();
		set1.retainAll(set2);
		System.out.println(set1);
//		System.out.println(set1.intersection(set2));

	}

}
