package week11;

import java.time.LocalDateTime;


public class Genre {
	
	private String name;
	private LocalDateTime lastEdited;
	public String description;
	
	public Genre(String name) {
		
		this.name = setName(name);
		this.lastEdited = setLastEdited();
	}

	public String setName(String name) {
		// 
		if(name != null & name.length()>3) {
			this.name = name;
			return this.name;
		}
		return null;
	}
	
	public String getName() {
		return this.name;
	}

	private LocalDateTime setLastEdited() {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}

}
