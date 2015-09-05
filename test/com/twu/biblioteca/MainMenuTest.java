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
        ByteArrayOutputStream byteArrayOutputStream = getByteArrayInputAndOutputStream("1");
        mainMenu.printOptions();

        Assert.assertEquals("1.List Books\nChoose one Option :Book Name\tAuthour Name\tYear Published\n" +
                "Head First Java\tKathy Sierra\t2009\n", byteArrayOutputStream.toString());
    }

    @Test
    public void shouldPrintTheOptionAndChooseOptionAlso() {
        MainMenu mainMenu = new MainMenu();
        ByteArrayOutputStream byteArrayOutputStream = getByteArrayInputAndOutputStream("1");

        mainMenu.printOptions();

        Assert.assertEquals("1.List Books\nChoose one Option :Book Name\tAuthour Name\tYear Published\n" +
                "Head First Java\tKathy Sierra\t2009\n", byteArrayOutputStream.toString());
    }

    @Test
    public void shouldPrintTheOptionAndChooseOptionIfHeChoose1ThenPrintTheListOfBooks() {
        MainMenu mainMenu = new MainMenu();
        ByteArrayOutputStream byteArrayOutputStream = getByteArrayInputAndOutputStream("1");

        mainMenu.printOptions();

        Assert.assertEquals("1.List Books\nChoose one Option :Book Name\tAuthour Name\tYear Published\n" +
                "Head First Java\tKathy Sierra\t2009\n", byteArrayOutputStream.toString());
    }

    @Test
    public void shouldPrintTheOptionAndChooseOptionIfHeChoose2ThenPrintSelectValidOption() {
        MainMenu mainMenu = new MainMenu();
        ByteArrayOutputStream byteArrayOutputStream = getByteArrayInputAndOutputStream("2");

        mainMenu.printOptions();

        Assert.assertEquals("1.List Books\nChoose one Option :Select a Valid Option!\n", byteArrayOutputStream.toString());
    }

    @Test
    public void shouldCloseTheApplicationAfterChoosingQuitOption() {
        MainMenu mainMenu = new MainMenu();
        ByteArrayOutputStream byteArrayOutputStream = getByteArrayInputAndOutputStream("2");

        mainMenu.printOptions();

        Assert.assertEquals("1.List Books\n2.Quit\nChoose one Option :\n", byteArrayOutputStream.toString());
    }

    private ByteArrayOutputStream getByteArrayInputAndOutputStream(String input) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));


        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        return byteArrayOutputStream;
    }
}
