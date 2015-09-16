package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserAccountsTest {

    @Test
    public void shouldReturnTheNormalMenuWhenUserNameAndPassWordsAreNotMatchedWIthTheList() {
        UserAccounts userAccounts = new UserAccounts();
        Menu menu = new NormalMenu();

        assertEquals(userAccounts.compare("Maharjun", "Maharjun").toString(), menu.toString());

    }
}
