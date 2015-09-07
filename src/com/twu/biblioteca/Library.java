//Library has list of books
package com.twu.biblioteca;

public class Library {
    private String[] books= {"Head First Java","Pragmatic programmer"};

    public void printBooksList() {
        for(int i=0 ;i<books.length;i++) {
            System.out.println(books[i]);
        }
    }
}
