package com.twu.biblioteca;

public class Books {
    private String[] list = {"Head First Java","Pragmatic Programming","Martin's Refactoring"};

    public void printBooksList() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
