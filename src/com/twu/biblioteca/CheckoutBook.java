package com.twu.biblioteca;

public class CheckoutBook {
    private String input;

    public String getInput() {
        UserInput userInput = new UserInput();
        this.input = userInput.getInput();
        return input;
    }
}
