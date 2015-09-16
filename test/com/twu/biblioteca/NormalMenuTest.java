package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class NormalMenuTest {

    @Test
    public void shouldShowTheListBooksOption() {
        NormalMenu normalMenu = new NormalMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", normalMenu.toString());
    }

    @Test
    public void shouldShowTheListAndQuitOptions() {
        NormalMenu normalMenu = new NormalMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", normalMenu.toString());
    }

    @Test
    public void shouldShowTheCheckoutMoviesption() {
        NormalMenu normalMenu = new NormalMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", normalMenu.toString());
    }

    @Test
    public void shouldShowTheLoginOptionAlongWithOtherOptions() {
        NormalMenu normalMenu = new NormalMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Login\n5.Quit", normalMenu.toString());
    }

    @Test
    public void shouldReturnRTheUserOptions() {
        NormalMenu normalMenu = new NormalMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book\n6.Quit", normalMenu.userOptions());
    }
}
