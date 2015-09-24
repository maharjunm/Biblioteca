package com.twu.biblioteca;

public class ListBooksMenuItem {

    private Library library;

    public ListBooksMenuItem(Library library) {
        this.library = library;
    }

    public String option() {
        return "List Books";
    }

    public void execute() {
        library.listBooks();
    }
}
