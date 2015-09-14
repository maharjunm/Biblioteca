//Movie has Name
package com.twu.biblioteca;

public class Movie {

    private double ratingOfTheMovie;
    private String director;
    private int yearReleased;
    private String movieName;

    public Movie(String movieName, int yearReleased, String director, double ratingOfTheMovie) {
        this.movieName = movieName;
        this.yearReleased = yearReleased;
        this.director = director;
        this.ratingOfTheMovie = ratingOfTheMovie;
    }

    @Override
    public String toString() {
        return movieName + "\t" + yearReleased + "\t" + director + "\t" + ratingOfTheMovie;
    }
}
