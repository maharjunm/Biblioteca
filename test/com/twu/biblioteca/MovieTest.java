package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldReturnTheMovieName() {
        Movie movie = new Movie("3 Idiots");

        assertEquals("3 Idiots", movie.toString());
    }
}
