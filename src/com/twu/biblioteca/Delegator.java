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
        display.print(menu.toString());
        display.print("Choose Any One Option :");
        String input = userInput.getInput();
        if (input.equals("1")) {
            display.print(library.toString());
        } else if (input.equals("2")) {
            String bookName = userInput.getInput();
            display.print(library.checkedOut(bookName));
        } else if (input.equals("3")) {
            String bookName = userInput.getInput();
            display.print(library.returnBook(bookName));
        } else if (input.equals("4")) {
            System.exit(0);
        } else {
            display.print("Select a valid option!");
        }
    }
}
