
package week09Practice;

public class Team {
	public int gamesWon;
	public String name;
	
	public Team() {
		this.name = "";
		this.gamesWon = 0;
	}
	
	public Team(String name, int gamesWon) {
		this.name = name;
		this.gamesWon = gamesWon;
	}
	
	@Override
	public boolean equals(Object team2) {
		Team secondTeam = (Team) team2;
		
		return
				this.name.equals(secondTeam.name)&&
				this.gamesWon == secondTeam.gamesWon;
	}
}
