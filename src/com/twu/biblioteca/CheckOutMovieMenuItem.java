package com.twu.biblioteca;

public class CheckOutMovieMenuItem {

    private Display display;
    private UserInput userInput;
    private Library library;

    public CheckOutMovieMenuItem(UserInput userInput, Library library, Display display) {
        this.userInput = userInput;
        this.library = library;
        this.display = display;
    }

    public String option() {
        return "Checkout Movie";
    }

    public void execute() {
        String movieName = userInput.getInput();
        display.print(library.checkedOutMovie(movieName));
    }
}
