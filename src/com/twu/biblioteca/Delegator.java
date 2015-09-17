//it delegates based on the options which user passes through console
package com.twu.biblioteca;

public class Delegator {
    private Menu normalMenu;
    private final UserInput userInput;
    private final Display display;
    private final Library library;
    private final UserAccounts userAccount;

    public Delegator(Menu normalMenu, UserInput userInput, Display display, Library library, UserAccounts userAccounts) {
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

    private void processTheOption() {
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
            userOption();
        } else if (input.equals("5")) {
            System.exit(0);
        } else {
            display.print("Select a valid option!");
        }
    }

    public void userOption() {
        String loginId = userInput.getInput();
        String password = userInput.getInput();
        normalMenu = userAccount.compare(loginId, password);
        if (normalMenu instanceof UserMenu) {
            while (true) {
                display.print(normalMenu.toString());
                processUserOption();
            }
        } else if (normalMenu instanceof AdminMenu) {
            display.print(normalMenu.toString());
        } else {
            display.print("Invalid User Name or Password!");
        }
    }

    private void processUserOption() {
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
            String bookName = userInput.getInput();
            display.print(library.checkedOut(bookName));
        } else if (input.equals("5")) {
            String bookName = userInput.getInput();
            display.print(library.returnBook(bookName));
        } else if (input.equals("6")) {
            normalMenu = new GuestMenu();
            start();
        } else if (input.equals("7")) {
            System.exit(0);
        } else {
            display.print("Select a valid option!");
        }
    }

    public void adminOption() {
        display.print("Choose Any One Option :");
        String input = userInput.getInput();
        switch (input) {
            case "1":
                display.print(library.toString());
                break;
            case "2":
                display.print(library.listMovies());
                break;
            case "3":
                String movieName = userInput.getInput();
                display.print(library.checkedOutMovie(movieName));
                break;
            case "4":
                String bookName = userInput.getInput();
                display.print(library.checkedOut(bookName));
                break;
            case "5":
                String thatBookName = userInput.getInput();
                display.print(library.returnBook(thatBookName));
                break;
            case "6":
                display.print(library.checkedOutList());
                break;
            case "8":
                System.exit(0);
            default:
                display.print("Select a valid option!");

        }
    }
}
