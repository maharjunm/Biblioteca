//Movie has Name
package com.twu.biblioteca;

public class Movie {

    private int yearReleased;
    private String movieName;

    public Movie(String movieName, int yearReleased) {
        this.movieName = movieName;
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return movieName + "\t" + yearReleased;
    }
}
