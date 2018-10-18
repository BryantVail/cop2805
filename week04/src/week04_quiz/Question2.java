package week04_quiz;

import java.util.HashSet;
import java.util.Set;

public class Question2 {

	public static void main(String[] args) {

		
		Set<String> set1 = new HashSet<>();
		set1.add("Atlanta");
		set1.add("Macon");
		set1.add("Savanna");

		Set<String> set2 = new HashSet<>();
		set2.add("Atlanta");
		set2.add("Macon");
		set2.add("Savanna");

		Set<String> set3 = new HashSet<>();
		set3.add("Atlanta");
		set3.add("Macon");
		set3.add("Savanna");

		System.out.println(set1.equals(set2)+ " " +set1.equals(set3));
		
		

	}

}
