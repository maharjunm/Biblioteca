package com.twu.biblioteca;

public class ListMoviesMenuItem {

    private Display display;
    private Library library;

    public ListMoviesMenuItem(Library library, Display display) {
        this.library = library;
        this.display = display;
    }

    public String option() {
        return "List Movies";
    }

    public void execute() {
        display.print(library.listMovies());
    }
}
