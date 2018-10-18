package week04_quiz;

import java.util.LinkedHashSet;

public class Question23_LinkedHashSet {

	public static void main(String[] args) {
		
		
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("New York");
		LinkedHashSet<String> set2 = set1;
		
		set1.add("Atlanta");
		set2.add("Dallas");
		
		System.out.println(set2);
		System.out.println(set1);
		

	}

}
