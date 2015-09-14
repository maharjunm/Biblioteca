package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldReturnTheMovieName() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani", 8.5);

        assertEquals("3 Idiots\t2009\tRajkumar Hirani\t8.5", movie.toString());
    }

    @Test
    public void shouldReturnTheMovieNameAndYear() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani", 8.5);

        assertEquals("3 Idiots\t2009\tRajkumar Hirani\t8.5", movie.toString());
    }

    @Test
    public void shouldReturnTheMovieNameYearAndDirectorName() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani", 8.5);

        assertEquals("3 Idiots\t2009\tRajkumar Hirani\t8.5", movie.toString());
    }

    @Test
    public void shouldReturnTheMovieNameYearDirectorNameAndRateOfTheMovie() {
        Movie movie = new Movie("3 Idiots", 2009, "Rajkumar Hirani" , 8.5);

        assertEquals("3 Idiots\t2009\tRajkumar Hirani\t8.5", movie.toString());
    }
}
