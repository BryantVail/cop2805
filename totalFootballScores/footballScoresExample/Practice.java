package footballScoresExample;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		ArrayList<String> myArray = new ArrayList<>();
		myArray.add("John");
		myArray.add("Bryant");
		myArray.add("Lewis");
//		myArray.add(1);
		
		System.out.println(myArray);
		System.out.println("myArray.contains(\"jacob\") returned: " + myArray.contains("jacob"));
		//this is a comment
		
	}
	
}


//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
//
//	at footballScoresExample.Practice.main(Practice.java:9)

//	[John, Bryant, Lewis, 1] prints but is not reliable probably outside of native objects. 