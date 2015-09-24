package com.twu.biblioteca;

public class ListMoviesMenuItem {

    private Library library;

    public ListMoviesMenuItem(Library library) {
        this.library = library;
    }

    public String option() {
        return "List Movies";
    }

    public void execute() {
        library.listMovies();
    }
}
