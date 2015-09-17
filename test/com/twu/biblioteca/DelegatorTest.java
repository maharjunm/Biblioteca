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
    public void shouldReturnTheAdminMenuOptionWhenAdminWantedToLoginIntoTheSystem() {
        Menu adminMenu = mock(AdminMenu.class);

        when(userInput.getInput()).thenReturn("B09-1893").thenReturn("B091893");
        when(userAccounts.compare("B09-1893", "B091893")).thenReturn(adminMenu);
        delegator.userOption();

        verify(display, times(1)).print(adminMenu.toString());
    }

    @Test
    public void shouldAskTheInputFromTheAdminWhenAdminLoggedIntoTheSystem() {

        when(userInput.getInput()).thenReturn("1");
        delegator.adminOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(userInput, times(1)).getInput();
    }

    @Test
    public void shouldPrintTheListBooksWhenAdminLoggedIntoTheSystem() {

        when(userInput.getInput()).thenReturn("1");
        delegator.adminOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(display, times(1)).print(library.toString());
    }

    @Test
    public void shouldPrintTheListMoviesWhenAdminLoggedIntoTheSystem() {

        when(userInput.getInput()).thenReturn("2");
        delegator.adminOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(display, times(1)).print(library.listMovies());
    }

    @Test
    public void shouldPrintTheCheckoutMessageWhenAdminLoggedIntoTheSystem() {

        when(userInput.getInput()).thenReturn("3").thenReturn("PK");
        delegator.adminOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(display, times(1)).print(library.checkedOut("PK"));
    }

    @Test
    public void shouldPrintTheCheckoutBookMessageWhenAdminLoggedIntoTheSystem() {

        when(userInput.getInput()).thenReturn("4").thenReturn("Head First Java");
        delegator.adminOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(display, times(1)).print(library.checkedOut("Head First Java"));
    }

    @Test
    public void shouldPrintTheReturnBookMessageWhenAdminLoggedIntoTheSystem() {

        when(userInput.getInput()).thenReturn("5").thenReturn("Head First Java");
        delegator.adminOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(display, times(1)).print(library.returnBook("Head First Java"));
    }

    @Test
    public void shouldExitTheApplicationWhenWeChoose5FromTheWhileLoop() {

        exit.expectSystemExit();

        when(userInput.getInput()).thenReturn("5");

        delegator.start();

    }
}
