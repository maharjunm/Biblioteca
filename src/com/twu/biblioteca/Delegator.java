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
                userOption();
                break;
            case "5":
                System.exit(0);
            default:
                display.print("Select a valid option!");
                break;
        }
    }

    public void userOption() {
        String loginId = userInput.getInput();
        String password = userInput.getInput();
        normalMenu = userAccount.compare(loginId, password);
        if (normalMenu instanceof UserMenu) {
            User user = userAccount.user(loginId,password);
            while (true) {
                display.print(normalMenu.toString());
                processUserOption(user);
            }
        } else if (normalMenu instanceof AdminMenu) {
            User user = userAccount.user(loginId,password);
            while (true) {
                display.print(normalMenu.toString());
                adminOption(user);
            }
        } else {
            display.print("Invalid User Name or Password!");
        }
    }

    private void processUserOption(User user) {
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
                display.print(library.checkedOut(bookName, user));
                break;
            case "5":
                String thatbookName = userInput.getInput();
                display.print(library.returnBook(thatbookName));
                break;
            case "6":
                display.print(user.toString());
                break;
            case "7":
                normalMenu = new GuestMenu();
                start();
            case "8":
                System.exit(0);
            default:
                display.print("Select a valid option!");
        }
    }

    public void adminOption(User user) {
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
                display.print(library.checkedOut(bookName, user));
                break;
            case "5":
                String thatBookName = userInput.getInput();
                display.print(library.returnBook(thatBookName));
                break;
            case "6":
                display.print(library.checkedOutList());
                break;
            case "7":
                display.print(user.toString());
                break;
            case "8":
                normalMenu = new GuestMenu();
                start();
            case "9":
                System.exit(0);
            default:
                display.print("Select a valid option!");

        }
    }
}
