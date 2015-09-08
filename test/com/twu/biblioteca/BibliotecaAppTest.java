package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    Library library = new Library();
    Menu menu = new Menu();
    Display display = new Display(new PrintStream(System.out));
    UserInput userInput = new UserInput();

    @Test
    public void shouldPrintTheWelcomeMessage() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bibliotecaApp.start();

        assertEquals("Welcome to Biblioteca\n", outContent.toString());
    }

    @Test
    public void shouldPrintShowTheListOptions() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bibliotecaApp.showOptions();

        assertEquals("1.List Books\n2.Checkout Book\n", outContent.toString());
    }

    @Test
    public void shouldPrintTheOptionsAndChooseOption() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bibliotecaApp.start();

        assertEquals("Welcome to Biblioteca\n1.List Books\n2.Checkout Book\nChoose Any One Option :\n", outContent.toString());
    }

    @Test
    public void shouldPrintTheListWhenWeChoose1() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String input = "1";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        System.setOut(new PrintStream(outContent));
        bibliotecaApp.start();
        String format = String.format("%-20S%-20S%-20S", "Head First Java", "Bert Bates", 2009);
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "____________________________________________________________________";

        assertEquals("Welcome to Biblioteca\n1.List Books\n2.Checkout Book\nChoose Any One Option :\n" + line + "\n" + header + "\n" + line + "\n" + format + "\n", outContent.toString());
    }

    @Test
    public void shouldPrintTheInvalidOptionWhenWeChoose2() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String input = "2";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        System.setOut(new PrintStream(outContent));
        bibliotecaApp.start();

        assertEquals("Welcome to Biblioteca\n1.List Books\n2.Checkout Book\nChoose Any One Option :\nSelect a valid option!\n", outContent.toString());
    }

    @Test
    public void shouldBreakTheLoopWhenWeChooseQuit() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);

    }
}