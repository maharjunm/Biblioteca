//Movie has Name
package com.twu.biblioteca;

public class Movie {

    private String director;
    private int yearReleased;
    private String movieName;

    public Movie(String movieName, int yearReleased, String director) {
        this.movieName = movieName;
        this.yearReleased = yearReleased;
        this.director = director;
    }

    @Override
    public String toString() {
        return movieName + "\t" + yearReleased + "\t" + director;
    }
}
