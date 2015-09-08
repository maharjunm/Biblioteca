package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void shouldShowTheListBooksOption() {
        Menu menu = new Menu();

        assertEquals("1.List Books", menu.toString());
    }


    @Test
    public void shouldShowTheListAndQuitOptions() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.Quit", menu.toString());
    }
}
