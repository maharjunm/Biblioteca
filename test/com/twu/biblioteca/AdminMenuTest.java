package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminMenuTest {

    @Test
    public void shouldReturnTheListBooksMenu() {
        AdminMenu adminMenu = new AdminMenu();

        assertEquals("1.List Books",adminMenu.toString());
    }
}
