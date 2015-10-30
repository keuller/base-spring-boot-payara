package fish.payara.appserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author keuller.magalhaes at gmail.com
 * @version 1.0
 */
public class MovieInfo implements java.io.Serializable {

    private static final long serialVersionUID = 14905602812L;

    String title;
    
    String year;
    
    String released;
    
    String genre;
    
    String actors;
    
    String imdbRating;
    
    String poster;
    
    String language;
    
    String country;
    
    String type;
    
    public MovieInfo() {
    }

    public String getTitle() { return title; }
    @JsonProperty("Title")
    public void setTitle(String title) { this.title = title; }

    public String getYear() { return year; }
    @JsonProperty("Year")
    public void setYear(String year) { this.year = year; }

    public String getCountry() { return country; }
    @JsonProperty("Country")
    public void setCountry(String value) { this.country = value; }
    
    public String getReleased() { return released; }
    @JsonProperty("Released")
    public void setReleased(String released) { this.released = released; }

    public String getGenre() { return genre; }
    @JsonProperty("Genre")
    public void setGenre(String genre) { this.genre = genre; }

    public String getLanguage() { return language; }
    @JsonProperty("Language")
    public void setLanguage(String value) { language = value; }
    
    public String getActors() { return actors; }
    @JsonProperty("Actors")
    public void setActors(String actors) { this.actors = actors; }

    public String getPoster() { return poster; }
    @JsonProperty("Poster")
    public void setPoster(String poster) { this.poster = poster; }

    public String getType() { return type; }
    @JsonProperty("Type")
    public void setType(String type) { this.type = type; }
    
    public String getImdbRating() { return imdbRating; }
    public void setImdbRating(String value) { imdbRating = value; }
    
    public String toString() { return title; }
}
