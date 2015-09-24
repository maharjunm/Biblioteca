package com.twu.biblioteca;

public class CheckOutMovieMenuItem {

    private UserInput userInput;
    private Library library;

    public CheckOutMovieMenuItem(UserInput userInput, Library library) {
        this.userInput = userInput;
        this.library = library;
    }

    public String option() {
        return "Checkout Movie";
    }

    public void execute() {
        String movieName = userInput.getInput();
        library.checkedOutMovie(movieName);
    }
}
