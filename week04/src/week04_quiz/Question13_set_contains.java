package week04_quiz;

import java.util.HashSet;
import java.util.Set;

public class Question13_set_contains {

	public static void main(String[] args) {

		
		
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set1.add("Atlanta");
		set1.add("Macon");
		
		set2.add("Atlanta");
		set2.add("Macon");
		set2.add("Savannah");
		
		System.out.println(set1.contains(set2));
		System.out.println(set2.contains(set1));
		System.out.println(set1.contains("Savannah"));
		System.out.println(set2.contains("Savannah"));
		

	}

}
