package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserMenuTest {

    @Test
    public void shouldReturnTheListBooksOption(){
        UserMenu userMenu = new UserMenu();

        assertEquals("1.List Books\n2.List Movies",userMenu.toString());
    }

    @Test
    public void shouldReturnTheListMoviesOption(){
        UserMenu userMenu = new UserMenu();

        assertEquals("1.List Books\n2.List Movies",userMenu.toString());
    }
}
