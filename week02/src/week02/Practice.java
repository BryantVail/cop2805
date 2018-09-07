package week02;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice {
	
	public static void main(String[] args) {
		
		ArrayList<Team> nfl = new ArrayList<>();
		nfl.add(new Team("Bears"));
		nfl.add(new Team("Bengals"));
		nfl.add(new Team("Bucs"));
		nfl.add(new Team("Browns"));
		
		
		System.out.println("The NFL: " + nfl);
		System.out.println("Index of Bucs: " + nfl.indexOf("Bucs"));
		
		for(int i = 0; i < nfl.size(); i++) {
			
			System.out.print(nfl.get(i)+ " ");
			
		}
		
		//manually iterate
		for(Team t: nfl) {
			System.out.print(t + " ");
		}
		
		nfl.forEach(t -> {
			System.out.print(t + "_");
		});
		
		
		//4. manually iterate with an iterator
		Iterator<Team> iterator = nfl.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+ " ");
		}
		
		
	}

}
