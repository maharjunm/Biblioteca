package com.twu.biblioteca;

public class CheckOutMovieMenuItem {

    private final UserInput userInput;

    public CheckOutMovieMenuItem(UserInput userInput) {
        this.userInput = userInput;
    }

    public String option() {
        return "Checkout Movie";
    }

    public void execute() {
        String movieName = userInput.getInput();
    }
}
