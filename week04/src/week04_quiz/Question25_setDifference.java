package week04_quiz;

import java.util.TreeSet;

public class Question25_setDifference {

	public static void main(String[] args) {
		
		
		TreeSet<String> set1 = new TreeSet<>();
		
		set1.add("Red");
		set1.add("Yellow");
		set1.add("Green");
		set1.add("Blue");
		
		TreeSet<String> set2 = new TreeSet<>();
		
		set2.add("Orange");
		set2.add("Yellow");
		set2.add("Green");
		set2.add("Blue");
		
		set1.removeAll(set2);
		System.out.println(set1);
		
		

	}

}
