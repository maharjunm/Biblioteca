package com.twu.biblioteca;

public class BibliotecaApp {

    private Menu menu;
    private Display display;
    private Library library;

    public BibliotecaApp(Library library, Display display, Menu menu) {
        this.library = library;
        this.display = display;
        this.menu = menu;
    }

    public static void main(String[] args) {
    }

    public void start() {
        display.print("Welcome to Biblioteca");
    }

    public void showOptions() {
        String menuOptions = menu.toString();
        display.print(menuOptions);
    }
}
