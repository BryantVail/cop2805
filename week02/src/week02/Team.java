package week02;

public class Team {
	
	private String name;
	
	public Team() {
		this.setName("");
		
	}
	
	public Team(String name) {
		this.setName(name);
	}
	
	@Override
	public String toString() {
		return this.getName();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
