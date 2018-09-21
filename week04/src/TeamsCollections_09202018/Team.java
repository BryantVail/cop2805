package TeamsCollections_09202018;

public class Team implements Comparable<Team> {
	
	public String teamName;
	public int wins;
	public int points;
	
	public Team() {
		this.teamName = "";
		this.wins = -1;
		this.points = -1;
	}
	
	public Team(String teamName, int wins, int points) {
		this.teamName = teamName;
		this.wins  = wins;
		this.points = points;
	}

	public int getPoints() {
		return this.points;
	}
	
	@Override
	public String toString() {
		return ("Team Name: "+this.teamName+", Wins: "+this.wins+", Points Scored: "+this.points);
	}

	@Override
	public int compareTo(Team arg0) {
		
		
		return 0;
	}
	
	
}
