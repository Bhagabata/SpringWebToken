package collections;

public class Movie {
 private String movieName;
 private String actor;
 private Integer releaseYear;
 
  Movie(String movieName,String actor,Integer releaseYear){
	  this.movieName=actor;
	  this.actor=actor;
	  this.releaseYear=releaseYear;
	  
  }
	public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getActor() {
	return actor;
}
public void setActor(String actor) {
	this.actor = actor;
}
public Integer getReleaseYear() {
	return releaseYear;
}
public void setReleaseYear(Integer releaseYear) {
	this.releaseYear = releaseYear;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
