package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    String format = String.format("%-20S%-20S%-20S%-20S", "3 Idiots", 2009, "Rajkumar Hirani", 8.5);

    @Test
    public void shouldReturnTheMovieName() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani", 8.5);

        assertEquals(format, movie.toString());
    }

    @Test
    public void shouldReturnTheMovieNameAndYear() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani", 8.5);

        assertEquals(format, movie.toString());
    }

    @Test
    public void shouldReturnTheMovieNameYearAndDirectorName() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani", 8.5);

        assertEquals(format, movie.toString());
    }

    @Test
    public void shouldReturnTheMovieNameYearDirectorNameAndRateOfTheMovie() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani", 8.5);

        assertEquals(format, movie.toString());
    }
}
