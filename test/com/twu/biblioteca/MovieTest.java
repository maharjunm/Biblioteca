package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldReturnTheMovieName() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani");

        assertEquals("3 Idiots\t2009\tRajkumar Hirani", movie.toString());
    }

    @Test
    public void shouldReturnTheMovieNameAndYear() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani");

        assertEquals("3 Idiots\t2009\tRajkumar Hirani", movie.toString());
    }

    @Test
    public void shouldReturnTheMovieNameYearAndDirectorName() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani");

        assertEquals("3 Idiots\t2009\tRajkumar Hirani", movie.toString());
    }
}
