package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }

    public void start() {
        printWelcomeMessage();
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to Biblioteca");
    }
}
