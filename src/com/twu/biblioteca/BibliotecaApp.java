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
        Menu menu = new Menu();

        Delegator delegator = new Delegator(menu, userInput, display, library);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(delegator, display);
        bibliotecaApp.start();
    }

    public void start() {
        display.print("Welcome to Biblioteca");
        delegator.start();
    }
}
