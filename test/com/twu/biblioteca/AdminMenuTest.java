package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminMenuTest {

    @Test
    public void shouldReturnTheListBooksOption() {
        AdminMenu adminMenu = new AdminMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book\n6.Checkout Details",adminMenu.toString());
    }

    @Test
    public void shouldReturnTheListMoviesOption() {
        AdminMenu adminMenu = new AdminMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book\n6.Checkout Details",adminMenu.toString());
    }

    @Test
    public void shouldReturnTheCheckoutMovieOption() {
        AdminMenu adminMenu = new AdminMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book\n6.Checkout Details",adminMenu.toString());
    }

    @Test
    public void shouldReturnTheCheckoutBookOption() {
        AdminMenu adminMenu = new AdminMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book\n6.Checkout Details",adminMenu.toString());
    }

    @Test
    public void shouldReturnTheReturnBookOption() {
        AdminMenu adminMenu = new AdminMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book\n6.Checkout Details",adminMenu.toString());
    }

    @Test
    public void shouldReturnTheCheckoutDetailsOption() {
        AdminMenu adminMenu = new AdminMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book\n6.Checkout Details",adminMenu.toString());
    }
}
