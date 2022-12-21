/*
 * Author Name: Philip Meshach
 * Date: 21-12-2022
 * Praise The Lord
 */
package org.niit.Domin;

public class Movie {

    private String movieName;
    private String movieId;
    private String movieRating;

    public Movie() {
    }

    public Movie(String movieName, String movieId, String movieRating) {
        this.movieName = movieName;
        this.movieId = movieId;
        this.movieRating = movieRating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }
}
