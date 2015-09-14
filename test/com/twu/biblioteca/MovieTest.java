package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldReturnTheMovieName() {
        Movie movie = new Movie("3 Idiots", 2009);

        assertEquals("3 Idiots\t2009", movie.toString());
    }

    @Test
    public void shouldReturnTheMovieNameAndYear() {
        Movie movie = new Movie("3 Idiots", 2009);

        assertEquals("3 Idiots\t2009", movie.toString());
    }
}
