package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }

    public void start() {
        printWelcomeMessage();
        List<Book> list = new ArrayList<>();
        list.add(new Book("Head First Java", "Kathy Sierra", 2009));
        Books books = new Books(list);
        books.printBooks();
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to Biblioteca");
    }
}
