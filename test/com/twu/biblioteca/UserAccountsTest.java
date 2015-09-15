package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserAccountsTest {

    @Test
    public void shouldReturnTheMenuWhenUserNameAndPassWordsAreEqual() {
        UserAccounts userAccounts = new UserAccounts();

        assertTrue(userAccounts.compare("B09-1893","B091893"));

    }
}
