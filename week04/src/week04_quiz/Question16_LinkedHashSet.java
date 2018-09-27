package week04_quiz;

import java.util.LinkedHashSet;

public class Question16_LinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("New York");
		
		LinkedHashSet<String> set2 = (LinkedHashSet<String>)(set1.clone());
		set1.add("Atlanta");
		set2.add("Dallas");
		
		System.out.println(set2);
		
		
		

	}

}
