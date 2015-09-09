package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    Library library = new Library();
    Menu menu = new Menu();
    Display display = new Display(new PrintStream(System.out));
    UserInput userInput = new UserInput();


    @Test
    public void shouldPrintMenuOptions() {
        Display display = mock(Display.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        bibliotecaApp.showOptions();

        verify(display, times(1)).print("1.List Books\n2.Checkout Book\n3.Return Book");
    }

    @Test
    public void shouldPrintTheListWhenWeChoose1() {
        Display display = mock(Display.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        String input = "1";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        bibliotecaApp.chooseOption();

        String format = String.format("%-20S%-20S%-20S", "Head First Java", "Bert Bates", 2009);
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "--------------------------------------------------------------------";

        verify(display, times(1)).print("Choose Any One Option :");
        verify(display, times(1)).print(line + "\n" + header + "\n" + line + "\n" + format);
    }

    @Test
    public void shouldPrintTheInvalidOptionWhenWeChoose2() {
        Display display = mock(Display.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        String input = "5";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        bibliotecaApp.chooseOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(display, times(1)).print("Select a valid option!");
    }

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldExitTheApplicationWhenWeChooseQuit() {
        exit.expectSystemExit();

        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        String input = "Quit";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        bibliotecaApp.chooseOption();

    }

    @Test
    public void shouldReturnTheThankYouMessageWhenWeChooseAvailableBook() {
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);

        when(userInput.getInput()).thenReturn("2").thenReturn("Head First Java");
        bibliotecaApp.chooseOption();

        verify(display, times(1)).print("Choose Any One Option :");
        verify(display, times(1)).print("Thank you! Enjoy the book");
    }

    @Test
    public void shouldReturnTheThankYouMessageWhenWeChooseValidBookToReturn() {
        Display display = mock(Display.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        String input = "3";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        library.checkedOut("Head First Java");
        bibliotecaApp.chooseOption();

        verify(display, times(1)).print("Thank you for returning the book.");
    }

    @Test
    public void shouldReturnTheMessageWhenWeChooseInvalidBookToReturn() {
        Display display = mock(Display.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        String input = "3";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        bibliotecaApp.chooseOption();

        verify(display, times(1)).print("That is not a valid book to return.");
    }

    @Test
    public void shouldPrintTheInvalidMessageWhenWeWantToReturnInvalidBookAfterChoosingListBooks() {
        UserInput userInput = mock(UserInput.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        when(userInput.getInput()).thenReturn("1").thenReturn("3").thenReturn("Quit");
        library.checkedOut("Head First Java");
        bibliotecaApp.chooseOption();

        verify(userInput, times(1)).getInput();
    }
}
