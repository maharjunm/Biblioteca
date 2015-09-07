package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class BibliotecaAppTest {

    @Test
    public void shouldPrintTheWelcomeMessage() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bibliotecaApp.start();

        assertEquals("Welcome To Biblioteca\n1.List Books\n", outContent.toString());
    }

    @Test
    public void shouldPrintTheWelcomeMessageAndShowTheListOptions() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bibliotecaApp.start();

        assertEquals("Welcome To Biblioteca\n1.List Books\n", outContent.toString());
    }
}