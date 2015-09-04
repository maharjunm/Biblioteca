package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }

    public void start() {
        printWelcomeMessage();
        Books books = new Books();
        books.printBooksList();
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to Biblioteca");
    }
}
