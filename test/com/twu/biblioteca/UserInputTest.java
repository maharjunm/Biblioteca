package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class UserInputTest {

    @Test
    public void shouldGetTheInputFromTheUser() {
        UserInput userInput = new UserInput();
        String input = "1";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Assert.assertEquals("1", userInput.getInput());
    }

}
