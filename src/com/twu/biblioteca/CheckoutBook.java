package com.twu.biblioteca;

public class CheckoutBook {
    private Display display;
    private Library library;

    public CheckoutBook(Library library, Display display) {
        this.library = library;
        this.display = display;
    }

    public void checkedOut(String thatBook) {
        if (library.findByBookName(thatBook)) {
            library.checkedOut(thatBook);
            display.print("Thank you! Enjoy the book");
        }else {
            display.print("That book is not available.");
        }
    }
}
