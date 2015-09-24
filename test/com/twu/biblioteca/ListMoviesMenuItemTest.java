package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ListMoviesMenuItemTest {

    @Test
    public void shouldReturnTheOption() {
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        ListMoviesMenuItem menuItem = new ListMoviesMenuItem(library,display);

        assertEquals("List Movies", menuItem.option());
    }

    @Test
    public void shouldReturnTheListMovies() {
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        ListMoviesMenuItem menuItem = new ListMoviesMenuItem(library,display);

        menuItem.execute();

        verify(library, times(1)).listMovies();
    }

    @Test
    public void shouldPrintTheListMovies() {
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        ListMoviesMenuItem menuItem = new ListMoviesMenuItem(library,display);

        when(library.listMovies()).thenReturn("Maharjun");
        menuItem.execute();

        verify(display, times(1)).print(library.listMovies());
    }
}
