package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.assertEquals;

public class QuitMenuItemTest {

    @Test
    public void shouldReturnTheOption() {
        QuitMenuItem quitMenuItem = new QuitMenuItem();

        assertEquals("Quit", quitMenuItem.option());
    }

    @Rule
    public ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldExitTheApplicationWhenWeChoose5FromTheWhileLoop() {
        exit.expectSystemExit();

        QuitMenuItem quitMenuItem = new QuitMenuItem();

        quitMenuItem.execute();
    }
}
