//Movie has Name
package com.twu.biblioteca;

public class Movie {

    private String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return movieName;
    }
}
