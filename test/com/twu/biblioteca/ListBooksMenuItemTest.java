package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ListBooksMenuItemTest {

    @Test
    public void shouldReturnTheListBooksOption() {
        Library library = mock(Library.class);
        ListBooksMenuItem menuItem = new ListBooksMenuItem(library);

        assertEquals("List Books", menuItem.option());
    }

    @Test
    public void shouldReturnTheListBooks() {
        Library library = mock(Library.class);
        ListBooksMenuItem menuItem = new ListBooksMenuItem(library);

        menuItem.execute();

        verify(library, times(1)).listBooks();
    }
}
