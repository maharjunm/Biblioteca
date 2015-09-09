package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class UserInputTest {

    @Test
    public void shouldGetTheInputFromTheUser() {
        String input = "Maharjun";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);

        Assert.assertEquals("Maharjun", userInput.getInput());
        System.setIn(inputStream);
    }

}
