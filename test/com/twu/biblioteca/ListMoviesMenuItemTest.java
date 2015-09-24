package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ListMoviesMenuItemTest {

    @Test
    public void shouldReturnTheOption() {
        Library library = mock(Library.class);
        ListMoviesMenuItem menuItem = new ListMoviesMenuItem(library);

        assertEquals("List Movies", menuItem.option());
    }

    @Test
    public void shouldReturnTheListMovies() {
        Library library = mock(Library.class);
        ListMoviesMenuItem menuItem = new ListMoviesMenuItem(library);

        menuItem.execute();

        verify(library, times(1)).listMovies();
    }


}
