//It will return the book and display the message
package com.twu.biblioteca;

public class ReturnBookMenuItem {

    private UserInput userInput;

    public ReturnBookMenuItem(UserInput userInput) {
        this.userInput = userInput;
    }

    public String option() {
        return "Return Book";
    }

    public void execute() {
        String bookName = userInput.getInput();
    }
}
