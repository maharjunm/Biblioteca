package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ListBooksMenuItemTest {

    @Test
    public void shouldReturnTheListBooksOption() {
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        ListBooksMenuItem menuItem = new ListBooksMenuItem(library, display);

        assertEquals("List Books", menuItem.option());
    }

    @Test
    public void shouldReturnTheListBooks() {
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        ListBooksMenuItem menuItem = new ListBooksMenuItem(library, display);

        menuItem.execute();

        verify(library, times(1)).listBooks();
    }

    @Test
    public void shouldPrintTheListBooks() {
        Library library = mock(Library.class);
        Display display = mock(Display.class);
        ListBooksMenuItem menuItem = new ListBooksMenuItem(library,display);

        when(library.listBooks()).thenReturn("Maharjun");
        menuItem.execute();

        verify(display, times(1)).print(library.listBooks());
    }
}
