package week09Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		names.add("John");
		names.add("Lewis");
		names.add("John");
		
		System.out.println("The names are: " + names);
		
		
		HashMap<String, Integer> league = new HashMap<String, Integer>();
		
		league.put("Red Sox", 108);
		league.put("Mariners", 73);
		league.put("Devil Rays", 68);
		league.put("Braves", 99);
		league.put("Pirates", 102);
		
//		System.out.println("Braves won games in the year "+ league.get("Braves"));
//		System.out.println("Hashcode of 'abc' is " + "abc".hashCode());
//		System.out.println("Hashcode of 'abc' is " + "acc".hashCode());
//		System.out.println("Hashcode of 'abc' is " + "abb".hashCode());
//		
//		
//		System.out.printf( "hashcode data location, hash %xd", )
		

	}

}
