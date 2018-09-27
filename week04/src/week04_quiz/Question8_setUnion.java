package week04_quiz;

import java.util.HashSet;
import java.util.Set;

public class Question8_setUnion {
	
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set1.add("John");
		set1.add("Bryant");
		
		set2.add("Steph");
		set2.add("Tyson");
		
		set1.addAll(set2);
		System.out.println(set1);
		
	}

}
