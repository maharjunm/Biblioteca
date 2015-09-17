package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.mockito.Mockito.*;

public class DelegatorTest {

    Menu menu = mock(Menu.class);
    Library library = mock(Library.class);
    Display display = mock(Display.class);
    UserInput userInput = mock(UserInput.class);
    UserAccounts userAccounts = mock(UserAccounts.class);
    Delegator delegator = new Delegator(menu, userInput, display, library, userAccounts);

    @Rule
    public ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldRestartTheApplicationWhenWeChoose6FromTheWhileLoopWhenUserLoggedIntoTheSystem() {
        exit.expectSystemExit();
        Menu menu = new UserMenu();

        when(userInput.getInput()).thenReturn("B09-1894").thenReturn("B091894").thenReturn("7").thenReturn("5");
        when(userAccounts.compare("B09-1894", "B091894")).thenReturn(menu);

        delegator.userOption();

        verify(display, times(1)).print(menu.toString());

    }
    @Test
    public void shouldRestartTheApplicationWhenWeChoose6FromTheWhileLoopWhenAdminLoggedIntoTheSystem() {
        exit.expectSystemExit();
        Menu menu = new AdminMenu();

        when(userInput.getInput()).thenReturn("B09-1893").thenReturn("B091893").thenReturn("7").thenReturn("5");
        when(userAccounts.compare("B09-1893", "B091893")).thenReturn(menu);

        delegator.userOption();

        verify(display, times(1)).print(menu.toString());

    }

    @Test
    public void shouldExitTheApplicationWhenWeChoose5FromTheWhileLoop() {

        exit.expectSystemExit();

        when(userInput.getInput()).thenReturn("5");

        delegator.start();

    }
}
