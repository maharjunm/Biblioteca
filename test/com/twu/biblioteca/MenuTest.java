package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void shouldShowTheListBooksOption() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", menu.toString());
    }

    @Test
    public void shouldShowTheListAndQuitOptions() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", menu.toString());
    }

    @Test
    public void shouldShowTheCheckoutMoviesption() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", menu.toString());
    }

    @Test
    public void shouldShowTheLoginOptionAlongWithOtherOptions() {
        Menu menu = new Menu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", menu.toString());
    }
}
