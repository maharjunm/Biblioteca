package com.twu.biblioteca;

public class Delegator {
    private final Menu menu;
    private final UserInput userInput;
    private final Display display;
    private final Library library;

    public Delegator(Menu menu, UserInput userInput, Display display, Library library) {
        this.menu = menu;
        this.userInput = userInput;
        this.display = display;
        this.library = library;
    }

    public void start() {
        display.print("Welcome to Biblioteca");
    }
}
