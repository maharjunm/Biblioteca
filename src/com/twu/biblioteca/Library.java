//Library has list of books
package com.twu.biblioteca;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void printBooksList() {
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "_____________________________________________";
        System.out.println(line + "\n" + header + line);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}
