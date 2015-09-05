package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainMenuTest {

    @Test
    public void shouldPrintTheMenuOptions() {
        MainMenu mainMenu = new MainMenu();
        ByteArrayOutputStream byteArrayOutputStream = getByteArrayInputAndOutputStream();
        mainMenu.printOptions();

        Assert.assertEquals("1.List Books\nChoose one Option :Book Name\tAuthour Name\tYear Published\n" +
                "Head First Java\tKathy Sierra\t2009\n", byteArrayOutputStream.toString());
    }

    @Test
    public void shouldPrintTheOptionAndChooseOptionAlso() {
        MainMenu mainMenu = new MainMenu();
        ByteArrayOutputStream byteArrayOutputStream = getByteArrayInputAndOutputStream();

        mainMenu.printOptions();

        Assert.assertEquals("1.List Books\nChoose one Option :Book Name\tAuthour Name\tYear Published\n" +
                "Head First Java\tKathy Sierra\t2009\n", byteArrayOutputStream.toString());
    }

    @Test
    public void shouldPrintTheOptionAndChooseOptionIfHeChoose1ThenPrintTheListOfBooks() {
        MainMenu mainMenu = new MainMenu();
        ByteArrayOutputStream byteArrayOutputStream = getByteArrayInputAndOutputStream();

        mainMenu.printOptions();

        Assert.assertEquals("1.List Books\nChoose one Option :Book Name\tAuthour Name\tYear Published\n" +
                "Head First Java\tKathy Sierra\t2009\n", byteArrayOutputStream.toString());
    }

    private ByteArrayOutputStream getByteArrayInputAndOutputStream() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        String input = "1";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        return byteArrayOutputStream;
    }
}
