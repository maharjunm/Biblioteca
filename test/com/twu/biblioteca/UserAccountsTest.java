package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserAccountsTest {

    @Test
    public void shouldReturnTheGuestMenuWhenUserNameAndPassWordsAreNotMatchedWIthTheList() {
        UserAccounts userAccounts = new UserAccounts();
        Menu menu = new GuestMenu();

        assertEquals(userAccounts.compare("Maharjun", "Maharjun").toString(), menu.toString());
    }

    @Test
    public void shouldReturnTheUserMenuWhenUserNameAndPassWordsAreMatchedWIthTheListAndTheRoleIsUser() {
        UserAccounts userAccounts = new UserAccounts();
        Menu menu = new UserMenu();

        assertEquals(userAccounts.compare("B09-1894", "B091894").toString(), menu.toString());
    }

    @Test
    public void shouldReturnTheAdminMenuWhenUserNameAndPassWordsAreMatchedWIthTheListAndTheRoleIsAdmin() {
        UserAccounts userAccounts = new UserAccounts();
        Menu menu = new AdminMenu();

        assertEquals(userAccounts.compare("B09-1893", "B091893").toString(), menu.toString());
    }
}
