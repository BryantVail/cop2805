package week04_quiz;

import java.util.HashSet;
import java.util.Set;

public class Question5 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(5);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(2);
		set2.add(3);
		set2.add(6);
		
		set.retainAll(set2);
		System.out.println(set);
		
		
		
		

	}

}
