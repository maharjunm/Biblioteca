package com.twu.biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {

    private UserInput userInput;
    private Menu menu;
    private Display display;
    private Library library;

    public BibliotecaApp(Library library, Display display, Menu menu, UserInput userInput) {
        this.library = library;
        this.display = display;
        this.menu = menu;
        this.userInput = userInput;
    }

    public static void main(String[] args) {
        Library library = new Library();
        Display display = new Display(new PrintStream(System.out));
        UserInput userInput = new UserInput();
        Menu menu = new Menu();

        BibliotecaApp bibliotecaApp = new BibliotecaApp(library, display, menu, userInput);
        bibliotecaApp.start();
    }

    public void start() {
        display.print("Welcome to Biblioteca");
        showOptions();
        chooseOption();
    }

    public void chooseOption() {
        display.print("Choose Any One Option :");
        String input = userInput.getInput();
        if (input.equals("1")) {
            display.print(library.toString());
        } else if (input.equals("2")) {
            String bookName = userInput.getInput();
            String output = library.checkedOut(bookName);
            display.print(output);
        } else if (input.equals("3")) {
            String bookName = "Head First Java";
            String output = library.returnBook(bookName);
            display.print(output);
        } else if (input.equals("Quit")) {
            System.exit(0);
        } else {
            display.print("Select a valid option!");
        }
    }

    public void showOptions() {
        String menuOptions = menu.toString();
        display.print(menuOptions);
    }
}
