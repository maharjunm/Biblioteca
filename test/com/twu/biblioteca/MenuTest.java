package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void shouldShowTheListBooksOption() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.Quit\n3.CheckOut Book", menu.toString());
    }

    @Test
    public void shouldShowTheListAndQuitOptions() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.Quit\n3.CheckOut Book", menu.toString());
    }

    @Test
    public void shouldShowTheListQuitAndCheckOutBookOptions() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.Quit\n3.CheckOut Book", menu.toString());
    }
}
