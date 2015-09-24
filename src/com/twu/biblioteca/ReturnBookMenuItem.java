//It will return the book and display the message
package com.twu.biblioteca;

public class ReturnBookMenuItem {

    private Display display;
    private Library library;
    private UserInput userInput;

    public ReturnBookMenuItem(UserInput userInput, Library library, Display display) {
        this.userInput = userInput;
        this.library = library;
        this.display = display;
    }

    public String option() {
        return "Return Book";
    }

    public void execute() {
        String bookName = userInput.getInput();
        display.print(library.returnBook(bookName));
    }
}
