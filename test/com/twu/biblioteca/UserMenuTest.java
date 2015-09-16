package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserMenuTest {

    @Test
    public void shouldReturnTheListBooksOption(){
        UserMenu userMenu = new UserMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book",userMenu.toString());
    }

    @Test
    public void shouldReturnTheListMoviesOption(){
        UserMenu userMenu = new UserMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book",userMenu.toString());
    }

    @Test
    public void shouldReturnTheCheckOutMovieOption(){
        UserMenu userMenu = new UserMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book",userMenu.toString());
    }

    @Test
    public void shouldReturnTheCheckOutBookOption(){
        UserMenu userMenu = new UserMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book",userMenu.toString());
    }

    @Test
    public void shouldReturnTheReturnBookOption(){
        UserMenu userMenu = new UserMenu();

        assertEquals("1.List Books\n2.List Movies\n3.Checkout Movie\n4.Checkout Book\n5.Return Book",userMenu.toString());
    }
}
