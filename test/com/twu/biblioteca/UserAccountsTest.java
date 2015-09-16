package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserAccountsTest {

    @Test
    public void shouldReturnTheMenuWhenUserNameAndPassWordsAreEqual() {
        UserAccounts userAccounts = new UserAccounts();

        assertTrue(userAccounts.compare("B09-1893","B091893"));

    }

    @Test
    public void shouldCallTheAdminMenuWhenUserTypeIsAdmin() {
        UserAccounts userAccounts = new UserAccounts();
        AdminMenu adminMenu = new AdminMenu();

        assertEquals(userAccounts.getCorrectMenu().toString(),adminMenu.toString());
    }
}
