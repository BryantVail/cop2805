package TeamsCollections_09202018;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		
		Map<String, Team> teams = new HashMap<String, Team>();
		
		teams.put("Buccaneers",  new Team("Buccaneers", 14, 115));
		teams.put("Jags",  new Team("Jags", 13, 100));
		teams.put("Patriots",  new Team("Patriots", 8, 55));
		teams.put("Dolphins",  new Team("Dolphins", 11, 84));

		System.out.println("Patriots have: "+teams.get("Patriots"));
		
		System.out.println("Teams: "+teams);
	}
	

}
