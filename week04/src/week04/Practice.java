package week04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map capitals = new HashMap<String, String>();
//		Map map2 = new HashMap<String, String>();
		
		capitals.put("United States", "Washington, DC");
		capitals.put("Brazil", "Brazilia");
		capitals.put("Venezuela", "Caracas");
		capitals.put("Canada", "Ottawa");
		
		System.out.println("Map = "+capitals);
		
		String capital = (String)capitals.get("Brazil");
		System.out.println("Capital of Brazil = "+capital);
		
		
		

	}

}
