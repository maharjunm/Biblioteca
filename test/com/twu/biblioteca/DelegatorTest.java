package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class DelegatorTest {

    Menu menu = mock(Menu.class);
    Library library = mock(Library.class);
    Display display = mock(Display.class);
    UserInput userInput = mock(UserInput.class);
    UserAccounts userAccounts = mock(UserAccounts.class);
    Delegator delegator = new Delegator(menu, userInput, display, library, userAccounts);

    @Test
    public void shouldPrintOptions() {

        when(userInput.getInput()).thenReturn("1");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
    }

    @Test
    public void shouldPrintOptionsAndChooseOption() {

        when(userInput.getInput()).thenReturn("1");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
    }

    @Test
    public void shouldGetTheInputFromTheUser() {


        when(userInput.getInput()).thenReturn("1");
        delegator.processTheOption();

        verify(userInput, times(1)).getInput();
    }

    @Test
    public void shouldPrintTheListBooksWhenWeChoose1() {

        when(userInput.getInput()).thenReturn("1");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print(library.toString());
    }

    @Test
    public void shouldPrintTheListOfMoviesWhenWeChoose2() {

        when(userInput.getInput()).thenReturn("2");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        verify(library, times(1)).listMovies();
    }

    @Test
    public void shouldCallTheCheckoutMovieFromTheLibraryWhenWeChoose3() {

        when(userInput.getInput()).thenReturn("3").thenReturn("Maharjun");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        verify(library, times(1)).checkedOutMovie(userInput.getInput());
    }

    @Test
    public void shouldPrintTheInvalidMessageWhenPasswordsAreNotMatchedWhenWeChoose4() {

        when(userInput.getInput()).thenReturn("4").thenReturn("Maharjun").thenReturn("Maharjun");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print("Invalid User Name or Password!");
    }

    @Test
    public void shouldReturnTheUserMenuOptionWhenUserWantedToLoginIntoTheSystem() {
        Menu userMenu = mock(UserMenu.class);

        when(userInput.getInput()).thenReturn("B09-1894").thenReturn("B091894");
        when(userAccounts.compare("B09-1894", "B091894")).thenReturn(userMenu);
        delegator.userOption();

        verify(display, times(1)).print(userMenu.toString());
    }

    @Test
    public void shouldReturnChooseAnyOneOptionMessage() {

        delegator.processUserOption();

        verify(display, times(1)).print("Choose Any One Option :");
    }

    @Test
    public void shouldGetTheInputFromTheUserAfterUserLoggedIntoTheApplication() {
        when(userInput.getInput()).thenReturn("1");
        delegator.processUserOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(userInput, times(1)).getInput();
    }

    @Test
    public void shouldPrintTheListBooksWhenWeChoose1AfterUserLoggedIntoTheApplication() {

        when(userInput.getInput()).thenReturn("1");
        delegator.processUserOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(display, times(1)).print(library.toString());
    }

    @Test
    public void shouldPrintTheListMoviesWhenWeChoose2AfterUserLoggedIntoTheApplication() {

        when(userInput.getInput()).thenReturn("2");
        delegator.processUserOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(display, times(1)).print(library.listMovies());
    }

    @Test
    public void shouldAskTheInputWhenWeChoose3AfterUserLoggedIntoTheApplication() {

        when(userInput.getInput()).thenReturn("3");
        delegator.processUserOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(userInput, times(2)).getInput();
    }

    @Test
    public void shouldAskTheCheckoutMovieMessageWhenWeChoose3AfterUserLoggedIntoTheApplication() {
        when(userInput.getInput()).thenReturn("3").thenReturn("PK");
        delegator.processUserOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print(library.checkedOutMovie("PK"));
    }

    @Test
    public void shouldAskTheInputWhenWeChoose4AfterUserLoggedIntoTheApplication() {

        when(userInput.getInput()).thenReturn("4").thenReturn("Maharjun");
        delegator.processUserOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(userInput, times(2)).getInput();
    }

    @Test
    public void shouldAskTheCheckoutBookMessageWhenWeChoose4AfterUserLoggedIntoTheApplication() {
        when(userInput.getInput()).thenReturn("4").thenReturn("Head First Java");
        delegator.processUserOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print(library.checkedOut("Head First Java"));
    }

    @Test
    public void shouldAskTheInputWhenWeChoose5AfterUserLoggedIntoTheApplication() {

        when(userInput.getInput()).thenReturn("5").thenReturn("Maharjun");
        delegator.processUserOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(userInput, times(2)).getInput();
    }

    @Test
    public void shouldAskTheReturnBookMessageWhenWeChoose5AfterUserLoggedIntoTheApplication() {
        when(userInput.getInput()).thenReturn("5").thenReturn("Head First Java");
        delegator.processUserOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        verify(userInput, times(2)).getInput();
        verify(display).print(library.returnBook(userInput.getInput()));
    }

    @Test
    public void shouldPrintInvalidOptionWhenUserLoggedIntoTheApplication() {

        when(userInput.getInput()).thenReturn("9");
        delegator.processUserOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print("Select a valid option!");
    }

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldExitTheApplicationWhenWeChoose7WhenUserLoggedIntoTheSystem() {
        exit.expectSystemExit();

        when(userInput.getInput()).thenReturn("7");

        delegator.processUserOption();
    }

    @Test
    public void shouldExitTheApplicationWhenWeChoose7FromTheWhileLoopWhenUserLoggedIntoTheSystem() {
        exit.expectSystemExit();
        Menu menu = new UserMenu();

        when(userInput.getInput()).thenReturn("B09-1894").thenReturn("B091894").thenReturn("7");
        when(userAccounts.compare("B09-1894","B091894")).thenReturn(menu);

        delegator.userOption();

    }

    @Test
    public void shouldRestartTheApplicationWhenWeChoose6FromTheWhileLoopWhenUserLoggedIntoTheSystem() {
        exit.expectSystemExit();
        Menu menu = new UserMenu();

        when(userInput.getInput()).thenReturn("B09-1894").thenReturn("B091894").thenReturn("7").thenReturn("5");
        when(userAccounts.compare("B09-1894","B091894")).thenReturn(menu);

        delegator.userOption();

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
    public void shouldPrintInvalidOptionWhenWeChooseInvalidOption() {

        when(userInput.getInput()).thenReturn("7");
        delegator.processTheOption();

        InOrder inOrder = inOrder(display);
        inOrder.verify(display, times(1)).print(menu.toString());
        inOrder.verify(display, times(1)).print("Choose Any One Option :");
        inOrder.verify(display, times(1)).print("Select a valid option!");
    }

    @Test
    public void shouldExitTheApplicationWhenWeChoose5() {
        exit.expectSystemExit();

        when(userInput.getInput()).thenReturn("5");

        delegator.processTheOption();

    }

    @Test
    public void shouldExitTheApplicationWhenWeChoose4FromTheWhileLoop() {
        exit.expectSystemExit();

        when(userInput.getInput()).thenReturn("5");

        delegator.start();

    }
}
