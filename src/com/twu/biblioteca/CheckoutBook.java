package com.twu.biblioteca;

public class CheckoutBook {
    private  Display display;
    private Library library;
    private String input;

    public CheckoutBook(Library library,Display display) {
        this.library = library;
        this.display = display;
    }

    public String getInput() {
        UserInput userInput = new UserInput();
        this.input = userInput.getInput();
        return input;
    }

    public void checkedOut(String thatBook) {
        if(library.findByBookName(thatBook)){
            library.checkedOut(thatBook);
        }
    }
}