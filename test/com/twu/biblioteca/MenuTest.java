package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void shouldShowTheListBooksOption() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.Checkout Book\n3.Return Book\n4.List Movies\n5.Quit", menu.toString());
    }

    @Test
    public void shouldShowTheListAndQuitOptions() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.Checkout Book\n3.Return Book\n4.List Movies\n5.Quit", menu.toString());
    }

    @Test
    public void shouldShowTheListQuitAndCheckOutBookOptions() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.Checkout Book\n3.Return Book\n4.Quit", menu.toString());
    }

    @Test
    public void shouldShowTheListQuitCheckOutBookOptionsAndReturnBookOptions() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.Checkout Book\n3.Return Book\n4.List Movies\n5.Quit", menu.toString());
    }

    @Test
    public void shouldShowTheListQuitCheckOutBookOptionsReturnBookOptionsAndQuitOptionAlso() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.Checkout Book\n3.Return Book\n4.List Movies\n5.Quit", menu.toString());
    }

    @Test
    public void shouldShowTheListQuitCheckOutBookOptionsReturnBookOptionsListMoviesAndQuitOptionAlso() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.Checkout Book\n3.Return Book\n4.List Movies\n5.Quit", menu.toString());
    }
}
