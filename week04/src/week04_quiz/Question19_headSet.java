package week04_quiz;

import java.util.SortedSet;
import java.util.TreeSet;

public class Question19_headSet {

	public static void main(String[] args) {
		
		
		TreeSet<String> set = new TreeSet<>();
		
		set.add("Red");
		set.add("Yellow");
		set.add("Green");
		set.add("Blue");
		
		SortedSet temp = set.headSet("Purple");
		
		System.out.println(temp.first());
		
		

	}

}
