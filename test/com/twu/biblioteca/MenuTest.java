package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void shouldShowTheListBooksOption() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n", menu.toString());
    }
}
