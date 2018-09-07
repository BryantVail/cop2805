package week02;


import java.util.ArrayList;

public class Roster {
	
	private ArrayList<String> roster = new ArrayList<>();
	
	public Roster() {
		
	}
	
	public boolean contains(String name, ArrayList<String> roster) {
		String playerName = "";
		ArrayList<String> localRoster = roster;
		
		for(int i = 0; i <localRoster.size() ; i++) {
			playerName = localRoster.get(i).toString();
			if(roster.get(i).toString() == playerName) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		
		
	}
	
	

}
