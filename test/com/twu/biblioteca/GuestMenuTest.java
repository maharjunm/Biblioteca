package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuestMenuTest {

    @Test
    public void shouldShowTheListBooksOption() {
        GuestMenu guestMenu = new GuestMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", guestMenu.toString());
    }

    @Test
    public void shouldShowTheListAndQuitOptions() {
        GuestMenu guestMenu = new GuestMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", guestMenu.toString());
    }

    @Test
    public void shouldShowTheCheckoutMoviesption() {
        GuestMenu guestMenu = new GuestMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", guestMenu.toString());
    }

    @Test
    public void shouldShowTheLoginOptionAlongWithOtherOptions() {
        GuestMenu guestMenu = new GuestMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", guestMenu.toString());
    }
}
