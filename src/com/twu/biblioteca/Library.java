//Library has list of books and it check out the book and we can return a book to it
package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    private ArrayList books = new ArrayList<Book>() {{
        add(new Book("Head First Java", "Bert Bates", 2009));
    }};
    private ArrayList checkedOutBooks = new ArrayList<Book>();
    private ArrayList movies = new ArrayList<Movie>() {{
        add(new Movie("3 Idiots", 2009, "Rajkumar Hirani", 8.5));
        add(new Movie("PK", 2014, "Rajkumar Hirani", 8.3));
    }};

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

    public String checkedOut(String thatBookName) {
        for (int i = 0; i < books.size(); i++) {
            Book thisBook = (Book) books.get(i);
            if (thisBook.searchByname(thatBookName)) {
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
            if (thisBook.searchByname(bookName)) {
                books.add(checkedOutBooks.get(i));
                checkedOutBooks.remove(i);
                return "Thank you for returning the book.";
            }
        }
        return "That is not a valid book to return.";
    }

    public String listMovies() {
        String result = "";
        String line = "---------------------------------------------------------------------------------";
        String header = String.format("%-20S%-20S%-20S%-20S", "Movie Name", "Year It Released ", "Direactor", "Rating of The Movie");
        result += line + "\n" + header + "\n" + line + "\n";
        for (int i = 0; i < movies.size(); i++) {
            result += movies.get(i) + "\n";
        }
        return result.substring(0,result.length()-1);

    }

    public String checkedOutMovie(String thatMovieName) {
        return "That movie is not available.";
    }
}
