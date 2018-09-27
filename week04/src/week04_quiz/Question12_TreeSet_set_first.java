package week04_quiz;

import java.util.Set;
import java.util.TreeSet;

public class Question12_TreeSet_set_first {

	public static void main(String[] args) throws Exception {

		
		Set<String> set = new TreeSet<String>();
		
		set.add("Red");
		set.add("Green");
		set.add("Blue");
//		String print = set.first();
		System.out.println(set.first());
		

	}

}
