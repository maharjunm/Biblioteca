package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListBooksMenuItemTest {

    @Test
    public void shouldReturnTheListBooksOption() {
        ListBooksMenuItem menuItem = new ListBooksMenuItem();

        assertEquals("List Books", menuItem.option());
    }
}
