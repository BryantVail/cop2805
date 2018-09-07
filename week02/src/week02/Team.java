package week02;

public class Team {
	
	private String name;
	
	public Team() {
		this.name = "";
		
	}
	
	public Team(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
