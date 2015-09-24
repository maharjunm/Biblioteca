//It will return the book and display the message
package com.twu.biblioteca;

public class ReturnBookMenuItem {

    private Library library;
    private UserInput userInput;

    public ReturnBookMenuItem(UserInput userInput, Library library) {
        this.userInput = userInput;
        this.library = library;
    }

    public String option() {
        return "Return Book";
    }

    public void execute() {
        String bookName = userInput.getInput();
        library.returnBook(bookName);
    }
}
