package com.twu.biblioteca;

public class ListBooksMenuItem {

    private Display display;
    private Library library;

    public ListBooksMenuItem(Library library, Display display) {
        this.library = library;
        this.display = display;
    }

    public String option() {
        return "List Books";
    }

    public void execute() {
        display.print(library.listBooks());
    }
}
