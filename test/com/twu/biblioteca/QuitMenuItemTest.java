package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.mockito.Mockito.when;

public class QuitMenuItemTest {

    @Rule
    public ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldExitTheApplicationWhenWeChoose5FromTheWhileLoop() {
        exit.expectSystemExit();

        QuitMenuItem quitMenuItem = new QuitMenuItem();

        quitMenuItem.execute();
    }
}
