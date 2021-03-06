//Biblioteca app have display and delegator
package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.Scanner;

public class BibliotecaApp {

    private final Delegator delegator;
    private final Display display;


    public BibliotecaApp(Delegator delegator, Display display) {
        this.delegator = delegator;
        this.display = display;
    }

    public static void main(String[] args) {
        Library library = new Library();
        Display display = new Display(new PrintStream(System.out));
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        UserAccounts userAccounts = new UserAccounts();
        GuestMenu guestMenu = new GuestMenu();

        Delegator delegator = new Delegator(guestMenu, userInput, display, library, userAccounts);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(delegator, display);
        bibliotecaApp.start();
    }

    public void start() {
        display.print("Welcome to Biblioteca");
        delegator.start();
    }
}
