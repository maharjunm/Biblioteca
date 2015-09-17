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

    @Test
    public void shouldReturnUserWhenPasswordAreNotMatched() {
        UserAccounts userAccounts = new UserAccounts();

        assertEquals(userAccounts.user("B09-asd", "asdasd"), null);
    }

    @Test
    public void shouldReturnUserWhenPasswordAreMatched() {
        UserAccounts userAccounts = new UserAccounts();
        User user = new User("B09-1893", "B091893", "Admin", "Maharjun", "maharjun123@gmail.com", "8498984842");

        assertEquals(userAccounts.user("B09-1893", "B091893").toString(), user.toString());
    }
}
