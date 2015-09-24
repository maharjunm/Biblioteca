package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListMoviesMenuItemTest {

    @Test
    public void shouldReturnTheOption() {
        ListMoviesMenuItem menuItem = new ListMoviesMenuItem();

        assertEquals("List Movies", menuItem.option());
    }
}
