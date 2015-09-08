package com.twu.biblioteca;

public class CheckoutBook {
    private Library library;
    private String input;

    public CheckoutBook(Library library) {
        this.library = library;
    }

    public String getInput() {
        UserInput userInput = new UserInput();
        this.input = userInput.getInput();
        return input;
    }

    public boolean isPresent() {
        if(library.findByBookName(input)) {
            return true;
        }
        return false;
    }
}
