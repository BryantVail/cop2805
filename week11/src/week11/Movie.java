package week11;

import java.time.LocalDateTime;

public class Movie {
	
	private String title;
	private String releaseYear;
	private String director;
	
	public Movie(String title) {
		this.title = setTitle(title);
	}
	
	public Movie(String title, String releaseYear, String director) {
		this.title = setTitle(title);
		this.releaseYear = setReleaseYear(releaseYear);
		this.director = setDirector(director);
	}

	private String setDirector(String director2) {
		if(director != null) {
			this.director = director;
			return this.director;
		}
		return null;
	}

	private String setReleaseYear(String releaseYear) {
		if(/*regEx*/ releaseYear != null) {
			this.releaseYear = releaseYear;
			return this.releaseYear;
		}
		return null;
	}

	public String setTitle(String title) {
		if(title != null) {
			this.title = title;
			return this.title;
		}
		return null;
	}

}
