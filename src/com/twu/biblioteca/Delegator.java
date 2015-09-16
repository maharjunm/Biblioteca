//it delegates based on the options which user passes through console
package com.twu.biblioteca;

public class Delegator {
    private final NormalMenu normalMenu;
    private final UserInput userInput;
    private final Display display;
    private final Library library;
    private final UserAccounts userAccount;

    public Delegator(NormalMenu normalMenu, UserInput userInput, Display display, Library library, UserAccounts userAccounts) {
        this.normalMenu = normalMenu;
        this.userInput = userInput;
        this.display = display;
        this.library = library;
        this.userAccount = userAccounts;
    }

    public void start() {
        while (true) {
            processTheOption();
        }
    }

    public void processTheOption() {
        display.print(normalMenu.toString());
        display.print("Choose Any One Option :");
        String input = userInput.getInput();
        if (input.equals("1")) {
            display.print(library.toString());
        } else if (input.equals("2")) {
            display.print(library.listMovies());
        } else if (input.equals("3")) {
            String movieName = userInput.getInput();
            display.print(library.checkedOutMovie(movieName));
        } else if (input.equals("4")) {
            processUserOption();
        } else if (input.equals("5")) {
            System.exit(0);
        } else {
            display.print("Select a valid option!");
        }
    }

    private void processUserOption() {
        String loginId = userInput.getInput();
        String password = userInput.getInput();
        display.print("Invalid User Name or Password!");
    }
}
