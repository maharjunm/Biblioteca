//Library has list of books
package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    private ArrayList books = new ArrayList<Book>() {{
        add(new Book("Head First Java", "Bert Bates", 2009));
    }};
    private ArrayList checkedOutBooks = new ArrayList<Book>();

    @Override
    public String toString() {
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "--------------------------------------------------------------------";
        String output = line + "\n" + header + "\n" + line + "\n";
        for (int i = 0; i < books.size(); i++) {
            output += books.get(i) + "\n";
        }
        return output.substring(0, output.length() - 1);
    }

    public String checkedOut(String thatBook) {
        for (int i = 0; i < books.size(); i++) {
            Book thisBook = (Book) books.get(i);
            if (thisBook.getName().equals(thatBook)) {
                checkedOutBooks.add(books.get(i));
                books.remove(i);
                return "Thank you! Enjoy the book";
            }
        }
        return "That book is not available.";
    }

    public String returnBook(String bookName) {
        for (int i = 0; i < checkedOutBooks.size(); i++) {
            Book thisBook = (Book) checkedOutBooks.get(i);
            if (thisBook.getName().equals(bookName)) {
                books.add(checkedOutBooks.get(i));
                checkedOutBooks.remove(i);
                return "Thank you for returning the book.";
            }
        }
        return "That is not a valid book to return.";
    }
}
