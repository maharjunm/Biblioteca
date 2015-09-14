//UserInput will take the input from the user and it will return that user input
package com.twu.biblioteca;

import java.util.Scanner;

public class UserInput {

    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        return scanner.nextLine();
    }
}
