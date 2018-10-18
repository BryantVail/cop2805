package week02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Practice {
	
	public static void main(String[] args) {
		
		LinkedList<Team> nfl = new LinkedList<>();
		nfl.add(new Team("Bears"));
		nfl.add(new Team("Bengals"));
		nfl.add(new Team("Bucs"));
		nfl.add(new Team("Browns"));
		
		//Lambdas: passing "code" as data
		Collections.sort(nfl, (t1,t2) -> t1.getName().compareTo(t2.getName()));
		
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
		
		
	}//end main(String[] args
	
	public class TeamComparator implements Comparator<Team>{
		public int compare(Team team1, Team team2) {
			return team1.getName().compareTo(team2.getName());
		}
	}

}
